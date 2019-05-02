package com.prayag.desai.scwjc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired // this is the field injection.
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	// define the init method
	@PostConstruct
	public void Start() {
		System.out.println("Start")	;
}
	
	// define the destroy method
	@PreDestroy
	public void Destroy() {
		System.out.println("Destroy")	;
}
	/*
	THIS IS CONSTRUCTOR INJECTION
	@Autowired
	public TennisCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}
	*/
	
	public TennisCoach() {
		// default no-arg constructor
		System.out.println("inside default no-arg constructor");
	}
	
	/* 
	// define a setter method
	@Autowired
	public void setFortuneService(FortuneService thefortuneService) {
		System.out.println("Inside the setter method");
		fortuneService = thefortuneService;
	}
	
	@Autowired
	public void thisisanewMethod(FortuneService thefortuneService) {
		System.out.println("Inside the method dependency injection");
		fortuneService = thefortuneService;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
			return "Practice forehand and top-spin";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	

}
