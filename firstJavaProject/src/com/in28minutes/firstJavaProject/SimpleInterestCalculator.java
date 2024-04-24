package com.in28minutes.firstJavaProject;

import java.math.BigDecimal;

public class SimpleInterestCalculator {

	private BigDecimal principal;
	private BigDecimal interest;

	public SimpleInterestCalculator(String principal, String interest) {
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest);
	}

	public BigDecimal calculateTotalValue(int noOfYears) {

		BigDecimal temp = principal.multiply(interest).multiply(new BigDecimal(noOfYears));
		return principal.add(temp);
	}

}
