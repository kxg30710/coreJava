package com.in28minutes.firstJavaProject;

public class Employee extends Person {
	private String title;
	private String employer;
	private String employeeGrade;
	private int salary;

	public Employee(String title, String employer, String employeeGrade, int salary) {

		this.title = title;
		this.employeeGrade = employeeGrade;
		this.employer = employer;
		this.salary = salary;
	}

	public String toString() {
		return super.toString() + String.format("%s, %s, %s, %s", title, employeeGrade, employer, salary);
	}
}
