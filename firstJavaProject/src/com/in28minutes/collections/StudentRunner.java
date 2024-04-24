package com.in28minutes.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Students implements Comparable<Students> {

	private int id;
	private String name;

	Students(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Students that) {

		return Integer.compare(this.id, that.id);
	}

	public String toString() {
		return id + " " + name;
	}

}

public class StudentRunner {

	public static void main(String[] args) {
		List<Students> students = List.of(new Students(1, "Kavitha"), new Students(100, "Vasanth"),
				new Students(50, "Adam"));

		List<Students> studentsAl = new ArrayList<>(students);

		Collections.sort(studentsAl);
		System.out.println(studentsAl);

	}

}
