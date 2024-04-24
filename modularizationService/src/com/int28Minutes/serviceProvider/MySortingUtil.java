package com.int28Minutes.serviceProvider;

import java.util.List;

import com.int28Minutes.serviceProviderAlgo.BubbleSort;

public class MySortingUtil {

	public List<String> sort(List<String> names) {
		BubbleSort bs = new BubbleSort();
		return bs.sort(names);
	}

}
