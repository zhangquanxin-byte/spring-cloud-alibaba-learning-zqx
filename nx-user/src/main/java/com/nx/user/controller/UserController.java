package com.nx.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user/{userId}")
    public String getUserName(@PathVariable Integer userId){
        return "天涯老师";
    }
}
