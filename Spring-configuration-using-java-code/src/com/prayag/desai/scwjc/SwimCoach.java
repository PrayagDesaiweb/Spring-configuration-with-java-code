package com.prayag.desai.scwjc;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}
	
	@Value("${foo.name}")
	private String name;

	  
	@Value("${foo.email}")
	private String email;
	
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}

		
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Swim";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
