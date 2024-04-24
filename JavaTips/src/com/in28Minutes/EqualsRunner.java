package com.in28Minutes;

import java.util.Objects;

class Client {
	private int id;

	Client(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return id == other.id;
	}

}

public class EqualsRunner {

	public static void main(String[] args) {

		Client c1 = new Client(1);
		Client c2 = new Client(1);

		System.out.println(c1.equals(c1));

		AccessModifiers am = new AccessModifiers();
		am.publicMethod();
		// am.privateMethod();
		am.protectedMethod();
		am.defaultMethod();

	}

}
