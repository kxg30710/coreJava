package com.in28Minutes.SpringFramework.learnspringframework.examples.a1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass {

	private Dependency1 dependency1;

	private Dependency2 dependency2;

	public void setDependency1(Dependency1 dependency1) {
		System.out.println("from setter");
		this.dependency1 = dependency1;
	}

	public void setDependency2(Dependency2 dependency2) {
		System.out.println("from setter");
		this.dependency2 = dependency2;
	}

	public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		System.out.println("from constructor");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}

}

@Component
class Dependency1 {

}

@Component
class Dependency2 {

}

@Configuration
@ComponentScan
public class DependencyInjectionGamingSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (var context = new AnnotationConfigApplicationContext(DependencyInjectionGamingSpring.class)) {

			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}

	}

}
