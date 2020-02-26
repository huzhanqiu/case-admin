package com.hzq.nacos.caseadminauth.controller;

import com.hzq.nacos.caseadminauth.service.sys.TSysAccountService;
import com.hzq.nacos.caseadmincommon.exception.CaseAdminException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: huzq
 * @Date: 2020/1/14/9:11 下午
 * @Description: case-admin
 */
@RestController
@RequestMapping("/api/config")
@RefreshScope
@Api(value = "测试异常", tags = "测试")
public class DemoController {
    @Value("${demo}")
    private String useLocalCache;

    @Resource
    private TSysAccountService accountService;

    @GetMapping("/get")
    public String get() {
        return useLocalCache;
    }

    @GetMapping("/getPk")
    @ApiOperation(value = "测试异常")
    public String getPk() {
        throw new CaseAdminException(404, "服务器错误");
//        rexturn accountService.getPk();

    }
}
