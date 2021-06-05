package com.anupcodes.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component()
public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Autowired
	public CricketCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		
	}

	@Override
	public String doExercise() {
		return "do 5 hours fast bowling";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
