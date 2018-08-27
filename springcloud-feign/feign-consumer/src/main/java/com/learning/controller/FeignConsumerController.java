package com.learning.controller;

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

}