package com.msb.order.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "msb-stock")
public interface StockFeignClient {

    @GetMapping("/stock/reduce/{productId}")
    String reduce(@PathVariable Integer productId);
}