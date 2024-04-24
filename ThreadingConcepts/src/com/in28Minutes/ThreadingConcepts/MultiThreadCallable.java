package com.in28Minutes.ThreadingConcepts;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultiThreadCallable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(2);

		List<CallableTask> lists = List.of(new CallableTask("Kavi"), new CallableTask("Vasee"),
				new CallableTask("John"));

		List<Future<String>> invokeAll = es.invokeAll(lists);

		for (Future<String> msg : invokeAll) {
			System.out.println(msg.get());
		}

	}

}
