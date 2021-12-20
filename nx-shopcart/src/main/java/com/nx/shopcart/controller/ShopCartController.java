package com.nx.shopcart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopCartController {

    @GetMapping("/shopcart/remove")
    public String remove(Integer productId,Integer userId){
        return "购物车移除成功";
    }
}
