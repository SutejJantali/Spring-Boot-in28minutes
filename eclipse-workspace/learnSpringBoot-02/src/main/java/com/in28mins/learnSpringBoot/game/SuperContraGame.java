package com.in28mins.learnSpringBoot.game;

public class SuperContraGame implements GamingConsole{
	public void up() {
		System.out.println("Sit Up");
	}
	public void down() {
		System.out.println("Sit Down");
	}
	public void left() {
		System.out.println("Go Back");
	}
	public void right() {
		System.out.println("Shoot a bullet");
	}
}
