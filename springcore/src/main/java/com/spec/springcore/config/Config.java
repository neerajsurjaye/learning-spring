package com.spec.springcore.config;


import com.spec.springcore.coach.Coach;
import com.spec.springcore.coach.impl.BaseBallCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean("baseball")
    public Coach aBaseBallCoach(){
        return new BaseBallCoach();
    }

}
