package com.msb.order.controller;

import com.msb.order.config.StockFeignClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
@Slf4j
@RestController
public class OrderController {
    @Autowired
    //@LoadBalanced
    private RestTemplate restTemplate;

    @Autowired
    private StockFeignClient stockFeignClient;

    @GetMapping("/order/create")
    public String createOrder(Integer productId,Integer userId){
//        String product = restTemplate.getForObject("http://localhost:9001/product/" + productId, String.class);
//        String userName = restTemplate.getForObject("http://localhost:10001/user/" + userId, String.class);
//        String result = restTemplate.getForObject("http://localhost:11001/stock/reduce//" + productId, String.class);
//        String shopCartResult = restTemplate.getForObject("http://localhost:12001/shopcart/remove?productId=" + productId +"&userId=" + userId, String.class);
//        return "用户：" + userName + "  购买了商品:" + product + " " + result + "  " + shopCartResult;
        //此时RestTemplate 并不能识别我们的msb-stock
        // 1、获取msb-stock列表
        // 2、选择一个进行调用
        //
        String result = restTemplate.getForObject("http://msb-stock/stock/reduce/" + productId,String.class);
        return "下单成功";
    }

    @GetMapping("/order/create2")
    public String createOrder(Integer productId){
        String reduce = stockFeignClient.reduce(productId);
        log.info("减库存成功：{}",reduce);
        return "下单成功";
    }
}
