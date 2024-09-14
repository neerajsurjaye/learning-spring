package com.spec.demoproject.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestDemo {

    @Value("${dev.name}")
    private String devName;

    @GetMapping(path = "/demo-data")
    public String getDemoData(){
        return "DemoData V4 \nDeveloped by : " + devName;
    }

}
