package com.hzq.nacos.caseadminrabbitsend.controller;


import com.hzq.nacos.caseadmincommon.constants.RabbitConsts;
import com.hzq.nacos.caseadminrabbitsend.message.MessageStruct;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: huzq
 * @Date: 2020/1/25/9:36 下午
 * @Description: case-admin
 */
@RestController
@RequestMapping("/api/bus/toDo")
public class ToDoMessageController {
    @Resource
    private RabbitTemplate rabbitTemplate;

    @PostMapping("/addCaseToDo")
    public String addCaseToDo(@RequestParam("ajjbxxes") String ajjbxxes) {
        try {
            rabbitTemplate.convertAndSend(RabbitConsts.DIRECT_MODE_QUEUE_ONE, new MessageStruct(ajjbxxes));
            return "success";
        } catch (AmqpException e) {
            e.printStackTrace();
            return "fail";
        }

    }
}
