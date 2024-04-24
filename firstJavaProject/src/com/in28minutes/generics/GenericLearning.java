package com.in28minutes.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericLearning<T extends Number> {

	List<T> l1 = new ArrayList<>();

	public List<T> addElements(T element) {
		l1.add(element);
		return l1;
	}

}
