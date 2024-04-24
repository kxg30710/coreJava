package com.in28minutes.firstJavaProject;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		String name = "Kavitha";
		int[] listOfMarks = { 100, 80, 95 };

		Student student = new Student(name, listOfMarks);

		int number = student.getNumberOfMarks();
		int sum = student.getTotalSumOfMarks();
		int maximumMark = student.getMaximumMark();
		int minimumMark = student.getMinimumMark();
		BigDecimal average = student.getAverageMarks();
		System.out.println(student);
		System.out.println("number: " + number);
		System.out.println("sum: " + sum);
		System.out.println("maximumMark: " + maximumMark);
		System.out.println("minimumMark: " + minimumMark);
		System.out.println("average: " + average);

		student.addNewMark(35);
		student.removeMarkAtIndex(1);
		System.out.println(student);

	}

}
