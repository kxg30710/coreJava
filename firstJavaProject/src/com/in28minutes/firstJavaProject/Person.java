package com.in28minutes.firstJavaProject;

public class Person {
	private String name;
	private String email;
	private int phone;

	public Person() {

	}

	public Person(String name) {
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String toString() {
		return String.format("%s, %s , %s", name, email, phone);
	}
}
