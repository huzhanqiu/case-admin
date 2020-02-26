package com.hzq.nacos.caseadminperson.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: huzq
 * @Date: 2020/1/19/11:25 上午
 * @Description: case-admin
 */
@FeignClient(name = "case-admin-auth")
public interface AccountFeign {
    @GetMapping(value = "/config/getPk")
    String getPk();
}
