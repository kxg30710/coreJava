package com.in28Minutes.SpringFramework.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public interface GamingConsole {
	public void right();

	public void left();

	public void up();

	public void down();
}
