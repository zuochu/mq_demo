package com.zuochu.mqdemo.controller;

import com.zuochu.mqdemo.producer.RabbitProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangjj
 * 2020/10/23
 */
@RestController
public class RabbitMqController {

    @Autowired
    private RabbitProducer rabbitProducer;

    @GetMapping("/sendDemoQueue")
    public Object sendDemoQueue() {
        rabbitProducer.sendDemoQueue();
        return "success";
    }

    @GetMapping("/sendFanout")
    public Object sendFanout() {
        rabbitProducer.sendFanout();
        return "success";
    }

    @GetMapping("/sendTopicTopicAB")
    public Object sendTopicTopicAB() {
        rabbitProducer.sendTopicTopicAB();
        return "success";
    }

    @GetMapping("/sendTopicTopicB")
    public Object sendTopicTopicB() {
        rabbitProducer.sendTopicTopicB();
        return "success";
    }

    @GetMapping("/sendTopicTopicBC")
    public Object sendTopicTopicBC() {
        rabbitProducer.sendTopicTopicBC();
        return "success";
    }

    @GetMapping("/sendDirect")
    public Object sendDirect() {
        rabbitProducer.sendDirect();
        return "success";
    }
}
