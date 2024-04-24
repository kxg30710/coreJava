package com.in28Minutes.SpringFramework.learnspringframework.GameRunner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28Minutes.SpringFramework.learnspringframework.game.GameRunner;

@Configuration
@ComponentScan("com.in28Minutes.SpringFramework.learnspringframework.game")
public class App02GamingSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (var context = new AnnotationConfigApplicationContext(App02GamingSpring.class)) {

			// System.out.println(context.getBean("game"));
			// System.out.println(context.getBeanDefinitionNames());

			context.getBean(GameRunner.class).run();

		}

	}

}
