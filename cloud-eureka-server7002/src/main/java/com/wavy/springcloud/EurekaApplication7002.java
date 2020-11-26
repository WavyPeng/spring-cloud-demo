package com.wavy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description
 * @Author pengweiwei
 * @Date 2020/11/26 20:54
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication7002.class, args);
    }
}
