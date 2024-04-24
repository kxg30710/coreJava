package com.in28Minutes.ThreadingConcepts;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounter {

	private int i;
	private int j;

	Lock lockI = new ReentrantLock();
	Lock lockJ = new ReentrantLock();

	public int getI() {

		return i;

	}

	public int getJ() {
		return j;
	}

	public void incrementI() {
		lockI.lock();
		i++;
		lockJ.unlock();
	}

	public void incrementJ() {
		lockJ.lock();
		j++;
		lockJ.unlock();
	}
}
