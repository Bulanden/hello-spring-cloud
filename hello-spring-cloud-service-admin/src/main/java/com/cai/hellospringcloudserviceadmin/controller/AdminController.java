package com.cai.hellospringcloudserviceadmin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("hi")
    public String sayHi(String message){
        return String.format("Hi your message is : %s port : %s",message,port);
    }
}
