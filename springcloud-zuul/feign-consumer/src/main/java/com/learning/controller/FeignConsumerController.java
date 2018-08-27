package com.learning.controller;

import com.learning.entity.User;
import com.learning.service.FeignConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignConsumerController {

    @Autowired
    FeignConsumerService consumerService;

    @RequestMapping("feign-consumer")
    public String feignConsumer() {
        consumerService.hello();
        return "feign consumer call finished!!!";
    }

    @RequestMapping("feign-consumer-user")
    public User feignConsumer2(User user) {
        consumerService.hello2();
        return consumerService.printUser(user);
    }
}
