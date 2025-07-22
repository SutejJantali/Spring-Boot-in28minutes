package com.in28mins.learnSpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
	@Bean
	public String name() {
		return "Sutej";
	}
	
	@Bean
	public Integer age() {
		return 23;
	}
}
