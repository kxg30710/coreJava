package com.in28Minutes.BusinessCalc;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BusinessServiceRunner {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(BusinessServiceRunner.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(BusinessCalculationService.class).findMax());

		}

	}

}
