package com.wavy.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Description
 * @Author pengweiwei
 * @Date 2020/12/5 22:00
 */
@RestController
@RequestMapping("/payment/consul")
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/test")
    public String testConsul() {
        return "springcloud with consul: " + serverPort + " " + UUID.randomUUID().toString();
    }
}
