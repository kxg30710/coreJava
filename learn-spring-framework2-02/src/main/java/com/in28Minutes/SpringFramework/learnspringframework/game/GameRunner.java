package com.in28Minutes.SpringFramework.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

	private GamingConsole game;

	public GameRunner(@Qualifier("packmanQualifier") GamingConsole game) {
		this.game = game;
	}

	public void run() {
		game.left();
		game.right();
		game.up();
		game.down();
	}

}
