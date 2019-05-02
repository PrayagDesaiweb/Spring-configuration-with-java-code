package com.prayag.desai.scwjc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class DemoApp {

	public static void main(String[] args) {
		// read a soring config java class.
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class); 
		Coach theCoach = context.getBean("swimCoach", Coach.class);
		// call a method of the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		// cloase the bean
		context.close();

		
	}

}
