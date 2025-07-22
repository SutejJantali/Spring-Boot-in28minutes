package com.in28mins.learnSpringBoot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.in28mins.learnSpringBoot.game.GameRunner;
import com.in28mins.learnSpringBoot.game.GamingConsole;
import com.in28mins.learnSpringBoot.game.PacMan;

@Configuration
public class GamingConfiguration {
	
	@Bean
	public GamingConsole game() {
		var game = new PacMan();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
}
