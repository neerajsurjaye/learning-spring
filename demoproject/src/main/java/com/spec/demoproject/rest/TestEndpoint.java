package com.spec.demoproject.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Path;

@RestController
public class TestEndpoint {

    @GetMapping(path="/test")
    public String test(){
        return "test";
    }

}
