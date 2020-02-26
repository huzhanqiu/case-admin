package com.hzq.nacos.caseadminrabbitsend.handler;

import com.alibaba.fastjson.JSON;
import com.hzq.nacos.caseadminrabbitsend.constants.RabbitConsts;
import com.hzq.nacos.caseadminrabbitsend.message.MessageStruct;
import com.rabbitmq.client.Channel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * <p>
 * 直接队列1 处理器
 * </p>
 */
@Slf4j
@RabbitListener(queues = RabbitConsts.DIRECT_MODE_QUEUE_ONE)
@Component
public class DirectQueueOneHandler {
    @Resource
    private JavaMailSender mailSender;
    @Value("${spring.mail.username}")
    private String from;

    /**
     * 如果 spring.rabbitmq.listener.direct.acknowledge-mode: auto，则可以用这个方式，会自动ack
     */
    // @RabbitHandler
    public void directHandlerAutoAck(MessageStruct message) {
        log.info("直接队列处理器，接收消息：{}", JSON.toJSONString(message));
    }

    @RabbitHandler
    public void directHandlerManualAck(MessageStruct messageStruct, Message message, Channel channel) {
        //  如果手动ACK,消息会被监听消费,但是消息在队列中依旧存在,如果 未配置 acknowledge-mode 默认是会在消费完毕后自动ACK掉
        final long deliveryTag = message.getMessageProperties().getDeliveryTag();
        try {
            log.info("直接队列1，手动ACK，接收消息：{}", JSON.toJSONString(messageStruct));
            // 通知 MQ 消息已被成功消费,可以ACK了
            channel.basicAck(deliveryTag, false);
            SimpleMailMessage email = new SimpleMailMessage();
            email.setFrom(from);
            email.setTo("343555388@qq.com");
            email.setSubject("案件修改成功");
            email.setText("案件修改成功，人员同步成功");
            mailSender.send(email);
//            return true;
        } catch (IOException e) {
            try {
                // 处理失败,重新压入MQ
                channel.basicRecover();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
//            return  false;
        }
    }
}
