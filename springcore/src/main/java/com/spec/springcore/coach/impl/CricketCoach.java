package com.spec.springcore.coach.impl;

import com.spec.springcore.coach.Coach;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("Creating cricket coach");
    }


    @Override
    public String getDailyWorkout() {
        return "Cricket Coach: Plan!";
    }
}
