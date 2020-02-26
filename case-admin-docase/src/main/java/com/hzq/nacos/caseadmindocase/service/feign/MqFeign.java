package com.hzq.nacos.caseadmindocase.service.feign;

import com.hzq.nacos.caseadmindocase.entity.ajjbxx.TbStAjjbxx;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Author: huzq
 * @Date: 2020/1/26/10:28 上午
 * @Description: case-admin
 */
@FeignClient(name = "case-admin-bus-send", fallback = MqFeignRollBack.class)
public interface MqFeign {
    @PostMapping("/api/bus/toDo/addCaseToDo")
    String sendCaseMq(@RequestParam("ajjbxxes") String ajjbxxes);


}
