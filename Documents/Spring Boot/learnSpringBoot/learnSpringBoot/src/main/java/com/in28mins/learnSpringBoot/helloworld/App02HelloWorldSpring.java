package com.in28mins.learnSpringBoot.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String args[]) {
		// 1. Launch a spring app/ context
		try(var context = 
				new AnnotationConfigApplicationContext(HelloWorldConfiguration.class))
		{
			// 2. Configure things we want spring to manage - create config class
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
		}
		
	}

}
