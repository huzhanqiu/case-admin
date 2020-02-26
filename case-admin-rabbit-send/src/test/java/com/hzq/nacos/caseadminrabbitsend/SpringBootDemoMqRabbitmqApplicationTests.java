package com.hzq.nacos.caseadminrabbitsend;


import com.hzq.nacos.caseadmincommon.constants.RabbitConsts;
import com.hzq.nacos.caseadminrabbitsend.message.MessageStruct;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoMqRabbitmqApplicationTests {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    /**
     * 测试直接模式发送
     */
    @Test
    public void sendDirect() {
        rabbitTemplate.convertAndSend(RabbitConsts.DIRECT_MODE_QUEUE_ONE, new MessageStruct("direct message"));
    }

    /**
     * 测试分列模式发送
     */
    @Test
    public void sendFanout() {
        rabbitTemplate.convertAndSend(RabbitConsts.FANOUT_MODE_QUEUE, "", new MessageStruct("fanout message"));
    }

    /**
     * 测试主题模式发送1
     */
    @Test
    public void sendTopic1() {
        rabbitTemplate.convertAndSend(RabbitConsts.TOPIC_MODE_QUEUE, "queue.aaa.bbb", new MessageStruct("topic message"));
    }

    /**
     * 测试主题模式发送2
     */
    @Test
    public void sendTopic2() {
        rabbitTemplate.convertAndSend(RabbitConsts.TOPIC_MODE_QUEUE, "ccc.queue", new MessageStruct("topic message"));
    }

    /**
     * 测试主题模式发送3
     */
    @Test
    public void sendTopic3() {
        rabbitTemplate.convertAndSend(RabbitConsts.TOPIC_MODE_QUEUE, "3.queue", new MessageStruct("topic message"));
    }


}

