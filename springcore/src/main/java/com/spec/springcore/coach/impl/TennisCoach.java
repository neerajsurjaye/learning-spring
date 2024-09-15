package com.spec.springcore.coach.impl;

import com.spec.springcore.coach.Coach;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TennisCoach implements Coach {

    public TennisCoach(){
        System.out.println("Creating: tennis coach");
    }

    @PostConstruct
    public void pingMeBeforeConstruct(){
        System.out.println("Constructed: Tennis Coach");
    }

    @Override
    public String getDailyWorkout() {
        return "Tennis Coach Workout";
    }
}
