package com.cai.hellospringcloudwebadminfeign.service.hystrix;

import com.cai.hellospringcloudwebadminfeign.service.AdminService;
import org.springframework.stereotype.Component;

@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String sayHi(String message) {
        return String.format("Hi your massge is : %s but request is bad",message);
    }
}
