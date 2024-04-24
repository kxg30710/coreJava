package com.in28minutes.firstJavaProject;

public class Review {
	private String review;
	private int id;
	private int rating;

	Review(int id, String review, int rating) {
		this.id = id;
		this.review = review;
		this.rating = rating;
	}

	public void setReview(int id, String review, int rating) {
		this.id = id;
		this.review = review;
		this.rating = rating;
	}

	public String toString() {
		return String.format("Rating - %s Review = %s", rating, review);
	}
}
