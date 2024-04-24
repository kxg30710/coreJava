package com.in28minutes.firstJavaProject;

public class FlyRunnable {

	public static void main(String[] args) {
		Flyable[] flyingObjects = { new Bird(), new Aeroplane() };

		for (Flyable obj : flyingObjects) {
			obj.fly();
		}
	}

}
