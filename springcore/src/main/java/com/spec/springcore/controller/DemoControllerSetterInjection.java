package com.spec.springcore.controller;

import com.spec.springcore.coach.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoControllerSetterInjection {

    private Coach myCoach;

    @Autowired
    public void setMyCoach(Coach myCoach){
        this.myCoach = myCoach;
    }


    @GetMapping("/dailyworkoutsecond")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

}
