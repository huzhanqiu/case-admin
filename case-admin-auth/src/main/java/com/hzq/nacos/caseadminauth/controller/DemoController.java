package com.hzq.nacos.caseadminauth.controller;

import com.alibaba.fastjson.JSON;
import com.hzq.nacos.caseadminauth.service.TSysAccountService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Arrays;

/**
 * @Author: huzq
 * @Date: 2020/1/14/9:11 下午
 * @Description: case-admin
 */
@RestController
@RequestMapping("/config")
@RefreshScope
public class DemoController {
    @Value("${demo}")
    private String useLocalCache;

    @Resource
    private TSysAccountService accountService;

    @RequestMapping("/get")
    public String get() {
        return useLocalCache;
    }

    @GetMapping("/getPk")
    public String getPk(){
        return JSON.toJSONString(accountService.listByIds(Arrays.asList("CD9AE6DEBC13405A989B5FEAE0232363")));
    }
}
