package com.spec.springcore.coach.impl;

import com.spec.springcore.coach.Coach;

public class BaseBallCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Baseball Coach: Plan!";
    }

}
