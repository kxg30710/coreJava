package com.in28Minutes.ThreadingConcepts;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Task extends Thread {
	private int number;

	Task(int number) {
		this.number = number;
	}

	public void run() {
		System.out.println("Task " + number + " is Running");
		for (int i = number * 100 - 99; i < number * 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println("Task" + number + " is done");
	}
}

class CallableTask implements Callable<String> {

	private String name;

	CallableTask(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "Hello " + name;
	}

}

public class ExecutorServiceRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		// ExecutorService executorService = Executors.newSingleThreadExecutor();
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		/*
		 * executorService.execute(new Task(1)); executorService.execute(new Task(2));
		 * executorService.execute(new Task(3)); Future<String> future =
		 * executorService.submit(new CallableTask("Task 1"));
		 */
		Future<String> future = executorService.submit(new CallableTask("Task 1"));
		System.out.println(future.get());
		executorService.shutdown();

	}

}
