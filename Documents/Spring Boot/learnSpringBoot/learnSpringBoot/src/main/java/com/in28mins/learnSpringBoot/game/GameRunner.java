package com.in28mins.learnSpringBoot.game;

public class GameRunner {
	private GamingConsole game;
	
	public GameRunner(GamingConsole game) {
		this.game = game;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running game: "+ game);
		game.up();
		game.down();
		game.right();
		game.left();
	}
}
