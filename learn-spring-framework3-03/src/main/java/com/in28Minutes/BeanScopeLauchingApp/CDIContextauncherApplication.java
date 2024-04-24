package com.in28Minutes.BeanScopeLauchingApp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class CDIContextauncherApplication {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(CDIContextauncherApplication.class)) {

		}

	}

}
