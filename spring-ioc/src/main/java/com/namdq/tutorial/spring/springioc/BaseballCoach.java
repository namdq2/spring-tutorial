package com.namdq.tutorial.spring.springioc;

public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice.";
    }
}
