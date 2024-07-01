package com.javaspringframework.learn_spring_framework_v1.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	GamingConsole game;
	
	public GameRunner(@Qualifier("SuperContraQualifier") GamingConsole game){
		this.game = game;
	}
	
	public void run() {
		System.out.println("Running the game : "+ game);
		game.down();
		game.up();
		game.left();
		game.right();
	}
}
