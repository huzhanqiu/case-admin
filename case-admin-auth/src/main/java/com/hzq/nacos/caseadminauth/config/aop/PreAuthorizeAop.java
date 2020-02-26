package com.hzq.nacos.caseadminauth.config.aop;


import com.hzq.nacos.caseadminauth.config.annotation.PreAuthorize;
import com.hzq.nacos.caseadminauth.entity.jwt.JwtUtil;
import com.hzq.nacos.caseadminauth.entity.jwt.ReturnData;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;
import java.time.format.DateTimeFormatter;

import static com.hzq.nacos.caseadminauth.util.DateUtil.getNowStr;

/**
 * 描述:添加了 JwtCheck 注解 的Aop
 *
 * @Auther: lzx
 * @Date: 2019/6/18 10:56
 */
@Component
@Aspect
@Slf4j
public class PreAuthorizeAop {
    @Resource
    HttpServletRequest request;

    @Pointcut("@annotation(com.hzq.nacos.caseadminauth.config.annotation.PreAuthorize)")
    private void proAuthAop() {

    }

    /**
     * 方法执行前后得aop
     *
     * @param point
     * @return
     * @throws Throwable
     */
    @Before("proAuthAop()")
    public Object aroundApi(JoinPoint point) throws Throwable {
        String token = null;
        token = request.getHeader("Authorization");
        if (StringUtils.isBlank(token)) {
            //没有token
            return authErro("请登陆");
        } else {
            //有token
            String roles = getHasAnyRoles(point);
            token = token.replace("Bearer ", "");
            boolean success = JwtUtil.checkRolesByToken(token, roles);
            if (!success) {
                throw new Exception("该用户没有权限！");
            }
            return point;
        }
    }

    /**
     * 认证错误输出
     *
     * @param mess 错误信息
     * @return
     */
    private Object authErro(String mess) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        ReturnData<String> returnData = new ReturnData<>(HttpStatus.UNAUTHORIZED.value(), getNowStr(), mess, mess);
        return returnData;
    }

    /**
     * 获取切面注解的描述
     *
     * @param joinPoint 切点
     * @return 描述信息
     * @throws Exception
     */
    public String getHasAnyRoles(JoinPoint joinPoint)
            throws Exception {
        String targetName = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();
        Class targetClass = Class.forName(targetName);
        Method[] methods = targetClass.getMethods();
        StringBuilder description = new StringBuilder();
        for (Method method : methods) {
            if (method.getName().equals(methodName)) {
                Class[] clazzs = method.getParameterTypes();
                if (clazzs.length == arguments.length) {
                    for (int index = 0; index < clazzs.length; index++) {
                        // 如果参数类型是请求和响应的http，则不需要拼接【这两个参数，使用JSON.toJSONString()转换会抛异常】
                        if (arguments[index] instanceof HttpServletRequest || arguments[index] instanceof HttpServletResponse) {
                            continue;
                        }
                        description.append(method.getAnnotation(PreAuthorize.class).hasAnyRole());
                        break;
                    }
                }
            }
        }
        return description.toString();
    }
}
