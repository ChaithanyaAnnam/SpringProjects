package com.java.sms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActuatorDemoController {

    @GetMapping("/get-info")
    public String getStringMessage(){
        return "Hi! you will be able to monitor health of the application";
    }
}
