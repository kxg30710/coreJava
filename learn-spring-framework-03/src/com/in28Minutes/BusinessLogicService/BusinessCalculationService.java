package com.in28Minutes.BusinessLogicService;

import java.util.Arrays;

public class BusinessCalculationService {

	public int findMax() {
		return Arrays.stram(dataService.retrieveData()).max().orElse(0);
	}
}
