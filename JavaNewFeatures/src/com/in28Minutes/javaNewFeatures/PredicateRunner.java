package com.in28Minutes.javaNewFeatures;

import java.util.List;
import java.util.function.Predicate;

public class PredicateRunner {

	public static boolean isEven(Integer number) {
		return number % 2 == 0;

	}

	public static void main(String[] args) {

		List<Integer> numbers = List.of(1, 3, 4, 5, 6, 34, 23, 67);

		Predicate<? super Integer> predicate = number -> number % 2 == 0;

		// numbers.stream().filter(predicate.negate()).forEach(e ->
		// System.out.println(e));

		numbers.stream().filter(Predicate.not(PredicateRunner::isEven)).forEach(e -> System.out.println(e));

	}

}
