package com.in28Minutes.ThreadingConcepts;

import java.util.concurrent.atomic.AtomicInteger;

public class AttomicClass {
	private AtomicInteger i = new AtomicInteger();
	private AtomicInteger j = new AtomicInteger();

	public int getI() {

		return i.get();

	}

	public int getJ() {
		return j.get();
	}

	public void incrementI() {

		i.incrementAndGet();

	}

	public void incrementJ() {
		j.incrementAndGet();
	}
}
