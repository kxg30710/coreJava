package com.in28minutes.firstJavaProject;

abstract class Animal1 {
	abstract void print();
}

class Dog1 extends Animal1 {
	public void print() {
		System.out.println("bow bow");
	}
}

class Cat1 extends Animal1 {
	public void print() {
		System.out.println("meow meow");
	}
}

public class AnimalRunner {

	public static void main(String[] args) {
		Animal1[] animals = { new Cat1(), new Dog1() };

		for (Animal1 animal : animals) {
			animal.print();
		}

	}

}
