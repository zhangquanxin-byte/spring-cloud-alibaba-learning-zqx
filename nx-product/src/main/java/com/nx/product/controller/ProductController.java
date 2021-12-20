package com.nx.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("/product/{productId}")
    public String getProduct(@PathVariable Integer productId){
        return "貂皮大衣";
    }
}
