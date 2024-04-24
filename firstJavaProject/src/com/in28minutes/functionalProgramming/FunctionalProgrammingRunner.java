package com.in28minutes.functionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

class abc implements Predicate<String> {

	@Override
	public boolean test(String t) {
		// TODO Auto-generated method stub
		return t.endsWith("at");
	}

}

class forEachFunctionality implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println(t);

	}

}

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(List.of("apple", "orange", "bat"));
		printWithFP(list);

		List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));

		// list1.stream().filter(ele -> ele % 2 != 0).forEach(ele ->
		// System.out.println(ele));

		int sum = list1.stream().reduce(0, (number1, number2) -> number1 + number2);

		// IntStream.range(1, 10).map(ele -> ele * ele).forEach(ele ->
		// System.out.print(ele + "\t"));

		// List.of("Apple", "Ant", "Bat").stream().forEach(ele ->
		// System.out.println(ele.toLowerCase()));

		// List.of("Apple", "Ant", "Bat").stream().forEach(ele -> System.out.println(ele
		// + " " + ele.length()));
	}

	private static void printWithFP(List<String> list) {
		// list.stream().filter(element -> element.endsWith("at")).forEach(element ->
		// System.out.println(element));
		list.stream().filter(new abc()).forEach(new forEachFunctionality());

	}

}
