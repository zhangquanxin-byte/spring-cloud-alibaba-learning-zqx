package com.nx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/order/create")
    public String createOrder(Integer productId,Integer userId){
//        String product = restTemplate.getForObject("http://localhost:9001/product/" + productId, String.class);
//        String userName = restTemplate.getForObject("http://localhost:10001/user/" + userId, String.class);
        String result = restTemplate.getForObject("http://nx-stock/stock/reduce//" + productId, String.class);
        //String shopCartResult = restTemplate.getForObject("http://localhost:12001/shopcart/remove?productId=" + productId +"&userId=" + userId, String.class);
       // return "用户：" + userName + "  购买了商品:" + product + " " + result + "  " + shopCartResult;
        return "下单成功";
    }
}
