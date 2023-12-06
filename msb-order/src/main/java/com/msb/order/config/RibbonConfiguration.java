package com.msb.order.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//@Configuration
public class RibbonConfiguration {
   /* @Bean
    public IRule ribbonRule(){
        //随机选择
        return new RandomRule();
    }*/
}