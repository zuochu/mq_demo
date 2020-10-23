package com.zuochu.mqdemo.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author zhangjj
 * 2020/10/23
 */
@Component
@RabbitListener(queues = "topic.b")
public class TopicBConsumer {

    @RabbitHandler
    public void received(String msg) {
        System.out.println("[topic.b] received message: " + msg);
    }
}
