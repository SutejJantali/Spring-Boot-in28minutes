package com.in28mins.learnSpringBoot;

import com.in28mins.learnSpringBoot.game.GameRunner;
import com.in28mins.learnSpringBoot.game.MarioGame;
import com.in28mins.learnSpringBoot.game.PacMan;
import com.in28mins.learnSpringBoot.game.SuperContraGame;

public class App01GamingBasicJava {
	public static void main(String args[]) {
		var game = new MarioGame();
		var game2 = new SuperContraGame();
		var game3 = new PacMan();
		var gameRunner = new GameRunner(game);
		var gameRunner2 = new GameRunner(game2);
		var gameRunner3 = new GameRunner(game3);
		gameRunner.run();
		gameRunner2.run();
		gameRunner3.run();

	}

}
