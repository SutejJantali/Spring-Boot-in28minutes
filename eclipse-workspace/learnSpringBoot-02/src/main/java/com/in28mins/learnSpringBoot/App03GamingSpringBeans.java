package com.in28mins.learnSpringBoot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.in28mins.learnSpringBoot.game.GameRunner;
import com.in28mins.learnSpringBoot.game.GamingConsole;
import com.in28mins.learnSpringBoot.game.MarioGame;
import com.in28mins.learnSpringBoot.game.PacMan;
import com.in28mins.learnSpringBoot.game.SuperContraGame;

@Configuration
@ComponentScan("com.in28mins.learnSpringBoot.game")
public class App03GamingSpringBeans {

	
	public static void main(String args[]) {
		try (var context = new AnnotationConfigApplicationContext(App03GamingSpringBeans.class))
		{
			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run();
	//		var game = new MarioGame();
	//		var game2 = new SuperContraGame();
	//		var game3 = new PacMan();
	//		var gameRunner = new GameRunner(game);
	//		var gameRunner2 = new GameRunner(game2);
	//		var gameRunner3 = new GameRunner(game3);
	//		gameRunner.run();
	//		gameRunner2.run();
	//		gameRunner3.run();
		}

	}

}
