package com.in28Minutes.BeanScopeLauchingApp;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
class Postconstruct {
	private PreDestroy preDestroy;

	public Postconstruct(PreDestroy preDestroy) {
		super();
		this.preDestroy = preDestroy;
		System.out.println("Bean initialized");
	}

	@PostConstruct
	public void initialize() {
		preDestroy.getReady();
	}

	@jakarta.annotation.PreDestroy
	public void cleanUp() {
		System.out.println("System clean up");
	}
}

@Component
class PreDestroy {

	public void getReady() {
		System.out.println("The system is ready right after initialization");

	}

}

@Configuration
@ComponentScan
public class PostAndPreConstructAnotation {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(PostAndPreConstructAnotation.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

		}
	}

}
