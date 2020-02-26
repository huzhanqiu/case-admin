package com.hzq.nacos.caseadmindocase.service.feign;

import com.hzq.nacos.caseadmindocase.entity.ajjbxx.TbStAjjbxx;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: huzq
 * @Date: 2020/1/26/10:29 上午
 * @Description: case-admin
 */
@Component
public class MqFeignRollBack implements MqFeign {
    @Override
    public String sendCaseMq(String ajjbxxes) {
        return null;
    }
}
