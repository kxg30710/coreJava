package com.in28minutes.firstJavaProject;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	String name;
	ArrayList<Integer> listOfMarks = new ArrayList<>();;

	public Student(String name, int... listOfMarks) {
		this.name = name;
		for (int mark : listOfMarks) {
			this.listOfMarks.add(mark);
		}
	}

	public int getNumberOfMarks() {
		// TODO Auto-generated method stub
		return listOfMarks.size();
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark : listOfMarks) {
			sum += mark;
		}
		return sum;
	}

	public int getMaximumMark() {
		return Collections.max(listOfMarks);

	}

	public int getMinimumMark() {
		return Collections.min(listOfMarks);
	}

	public BigDecimal getAverageMarks() {

		return new BigDecimal(getTotalSumOfMarks() / getNumberOfMarks());

	}

	public void addNewMark(int newMark) {
		listOfMarks.add(newMark);

	}

	public void removeMarkAtIndex(int i) {
		listOfMarks.remove(i);

	}

	public String toString() {

		return listOfMarks.toString();
	}
}
