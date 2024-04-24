package com.int28Minutes.consumer;

import java.util.List;
import java.util.logging.Logger;

import com.int28Minutes.serviceProvider.MySortingUtil;

public class MyUtilRunner {

	private static Logger logger = Logger.getLogger(MyUtilRunner.class.getName());

	public static void main(String[] args) {

		List<String> ls = List.of("Kavitha", "Vasanth", "Adam");

		MySortingUtil msu = new MySortingUtil();
		List<String> sort = msu.sort(ls);
		logger.info(sort.toString());

	}

}
