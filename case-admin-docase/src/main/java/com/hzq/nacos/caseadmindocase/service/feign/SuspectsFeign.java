package com.hzq.nacos.caseadmindocase.service.feign;

import com.hzq.nacos.caseadmindocase.entity.ajjbxx.TbStAjjbxx;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Author: huzq
 * @Date: 2020/1/17/3:23 下午
 * @Description: case-admin
 */
@FeignClient(name = "case-admin-person", fallback = SuspectsFeignRollBack.class)
public interface SuspectsFeign {
    @GetMapping(value = "/api/person/suspects/selectPerson")
    String selectPerson(@RequestParam("ajbh") String ajbh);

    @PutMapping(value = "/api/person/suspects/updatePerson")
    String updatePerson(@RequestParam("ajbh") String ajbh);
}
