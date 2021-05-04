package com.namdq.tutorial.spring.springioc;

public class FootballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on running practice.";
    }
}
