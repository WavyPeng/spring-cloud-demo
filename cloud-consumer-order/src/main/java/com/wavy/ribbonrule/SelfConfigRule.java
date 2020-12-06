package com.wavy.ribbonrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description 自定义Ribbon负载均衡规则
 * @Author pengweiwei
 * @Date 2020/12/6 21:06
 */
@Configuration
public class SelfConfigRule {

    @Bean
    public IRule myRule() {
        return new RandomRule();
    }
}
