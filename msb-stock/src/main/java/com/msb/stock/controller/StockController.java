package com.msb.stock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {
    @GetMapping("/stock/reduce/{productId}")
    public String reduce(@PathVariable Integer productId){
        System.out.println("减库存成功");
        return "减库存成功";
    }
}
