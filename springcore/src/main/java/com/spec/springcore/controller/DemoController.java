package com.spec.springcore.controller;

import com.spec.springcore.coach.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

    @Autowired
    DemoController(Coach myCoach){
        this.myCoach = myCoach;
    }

}
