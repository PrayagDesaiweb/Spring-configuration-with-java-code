package com.prayag.desai.scwjc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.prayag.desai.scwjc")
public class SportConfig {
 // define bean for our sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		// the method name is the actual bean id 
		return new SadFortuneService();
	}
	
	// define bean for the swim coach and inject dependency of the spring coach
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}
