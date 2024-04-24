/**
 * 
 */
package com.in28Minutes.ThreadingConcepts;

class Task1 extends Thread {

	public void run() {
		System.out.println("Task1 Kickstart");
		for (int i = 0; i < 100; i++) {
			System.out.print(i + "  ");
		}
		System.out.println("Task 1 done");
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.println("Task2 Kickstart");
		for (int i = 101; i < 200; i++) {
			System.out.print(i + "  ");
		}
		System.out.println("Task 2 done");
	}

}

public class ThreadingConcepts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Task1 task1 = new Task1();
		task1.start();
		task1.setPriority(10);

		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.start();

		for (int i = 201; i < 300; i++) {
			System.out.print(i + " ");
		}

	}

}
