package com.anupcodes.springdemo;

import org.springframework.stereotype.Component;

@Component()
public class TennisCoach implements Coach {

	@Override
	public String doExercise() {
        return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
