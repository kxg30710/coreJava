package com.in28Minutes.package2;

class staticVariableHolder {

	private String name;
	private static int count;

	staticVariableHolder(String name) {
		this.name = name;
		count++;
	}

	public String getName() {
		return name;
	}

	public int getCount() {
		return count;
	}

}

public class Player {

	public static void main(String[] args) {
		staticVariableHolder obj1 = new staticVariableHolder("Kavi");
		System.out.println(obj1.getCount());
		staticVariableHolder obj2 = new staticVariableHolder("Vasee");

		System.out.println(obj2.getCount());
	}

}
