package com.hzq.nacos.caseadminauth.controller.auth;

import com.alibaba.fastjson.JSON;
import com.hzq.nacos.caseadminauth.entity.jwt.JwtModel;
import com.hzq.nacos.caseadminauth.entity.jwt.JwtUtil;
import com.hzq.nacos.caseadminauth.entity.jwt.ReturnData;
import com.hzq.nacos.caseadminauth.entity.jwt.UserDTO;
import com.hzq.nacos.caseadminauth.entity.sys.TSysAccount;
import com.hzq.nacos.caseadminauth.entity.xtrz.TbXtRzDl;
import com.hzq.nacos.caseadminauth.service.sys.TSysAccountRoleService;
import com.hzq.nacos.caseadminauth.service.sys.TSysAccountService;
import com.hzq.nacos.caseadminauth.service.sys.TSysRoleService;
import com.hzq.nacos.caseadminauth.service.sys.TbXtRzDlService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.UUID;

import static com.hzq.nacos.caseadminauth.util.DateUtil.getNowStr;


/**
 * 描述: 认证接口
 *
 * @author huzq
 * @Date: 2019/7/9 13:53
 */
@RestController
@Slf4j
@Api(value = "系统登录", tags = "系统登录")
@RequestMapping("/api/auth")
public class AuthController {

    @Value("${jwt.effective-time}")
    private String effectiveTime;

    @Autowired
    private TSysAccountService accountService;
    @Autowired
    private TSysAccountRoleService roleService;
    @Resource
    private TbXtRzDlService xtRzDlService;
    @Autowired
    HttpServletRequest request;

    /**
     * 登陆认证接口
     *
     * @param userDTO
     * @return
     */
    @ApiOperation("系统登录")
    @ApiImplicitParam(name = "userDTO", value = "传入username、password")
    @PostMapping("/login")
    public ReturnData<String> login(@RequestBody UserDTO userDTO) throws Exception {

        String jwt = null;
        String cgbs = "0";
        String error = "";
        //查询出现有的用户
        TSysAccount account = accountService.selectByUser(userDTO);
        if (account != null) {
            if (BCrypt.checkpw(userDTO.getPassword(), account.getBcrpassword())) {
                //查询所有role
                List<String> roles = roleService.listByUserId(account.getPk());
                if (CollectionUtils.isEmpty(roles)) {
                    cgbs = "0";
                    error = "该用户没有权限";
                    saveDlRz(cgbs, error, account);
                    return new ReturnData<>(HttpStatus.NO_CONTENT.value(), "该用户没有权限", getNowStr(), jwt);
                }
                JwtModel jwtModel = new JwtModel(userDTO.getUsername(), userDTO.getDwdm(), roles);
                int effectivTimeInt = Integer.valueOf(effectiveTime);
                jwt = JwtUtil.createJWT(userDTO.getUsername(), userDTO.getUsername(), JSON.toJSONString(jwtModel), effectivTimeInt * 1000L);
                cgbs = "1";
                saveDlRz(cgbs, error, account);
                return new ReturnData<>(HttpStatus.OK.value(), "认证成功", getNowStr(), jwt);
            } else {
                cgbs = "0";
                error = "密码错误";
                saveDlRz(cgbs, error, account);
                return new ReturnData<>(HttpStatus.OK.value(), "密码错误", getNowStr(), jwt);
            }
        } else {
            cgbs = "0";
            error = "不存在该用户";
            saveDlRz(cgbs, error, null);
            return new ReturnData<>(HttpStatus.OK.value(), "认证失败", getNowStr(), jwt);
        }
    }

    public void saveDlRz(String cgbs, String error, TSysAccount account) {
        TbXtRzDl rzDl = new TbXtRzDl();
        rzDl.setDlrzid(UUID.randomUUID().toString().replace("-", ""));
        if (account != null) {
            rzDl.setSfzh(account.getIdno());
            rzDl.setYhbs(account.getYhid());
            rzDl.setXm(account.getXm());
            rzDl.setDwdm(account.getJgdm());
            rzDl.setDwmc(account.getJgmc());
        }
        rzDl.setDlsj(getNowStr());
        rzDl.setIp(getIp(""));
        rzDl.setYxx("1");
        rzDl.setError(error);
        rzDl.setCgbs(cgbs);
        xtRzDlService.save(rzDl);
    }

    /**
     * 为授权提示
     */
    @ApiOperation("用户未登录")
    @GetMapping("/unauthorized")
    public ReturnData<String> unauthorized() {
        return new ReturnData<String>(HttpStatus.UNAUTHORIZED.value(), "未认证,请重新登陆", getNowStr(), null);
    }

    private String getIp(String ip) {
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                ip = request.getHeader("Proxy-Client-IP");
            }
            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                ip = request.getHeader("WL-Proxy-Client-IP");
            }
            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                ip = request.getHeader("HTTP_CLIENT_IP");
            }
            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                ip = request.getHeader("HTTP_X_FORWARDED_FOR");
            }
            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                ip = request.getRemoteAddr();
            }
        }
        return ip;
    }
}
