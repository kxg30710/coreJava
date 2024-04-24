package com.int28Minutes.serviceProvider;

import java.util.List;

public class MySortingUtil {

	public List<String> sort(List<String> names) {
		BubbleSort bs = new BubbleSort();
		return bs.sort(names);
	}

}
