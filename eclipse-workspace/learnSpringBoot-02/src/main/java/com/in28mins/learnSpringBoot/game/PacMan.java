package com.in28mins.learnSpringBoot.game;

import org.springframework.stereotype.Component;

@Component
public class PacMan implements GamingConsole{
	public void up() {
		System.out.println("Go Jump");
	}
	public void down() {
		System.out.println("Go into a hole");
	}
	public void left() {
		System.out.println("Go Back");
	}
	public void right() {
		System.out.println("Go Accelerate");
	}
}
