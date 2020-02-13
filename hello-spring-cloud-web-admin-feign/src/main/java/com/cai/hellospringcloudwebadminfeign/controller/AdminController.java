package com.cai.hellospringcloudwebadminfeign.controller;

import com.cai.hellospringcloudwebadminfeign.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "hi")
    public  String  sayHI(String message){
        return adminService.sayHi(message);
    }
}
