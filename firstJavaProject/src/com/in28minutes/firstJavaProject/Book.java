package com.in28minutes.firstJavaProject;

import java.util.ArrayList;

public class Book {

	private int id;
	private String nameOfTheBook;
	private String Author;
	ArrayList reviews = new ArrayList();

	Book(int id, String nameOfTheBook, String Author) {
		this.id = id;
		this.Author = Author;
		this.nameOfTheBook = nameOfTheBook;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameOfTheBook() {
		return nameOfTheBook;
	}

	public void setNameOfTheBook(String nameOfTheBook) {
		this.nameOfTheBook = nameOfTheBook;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public void addReview(Review review) {
		this.reviews.add(review);
	}

	public String toString() {
		return String.format("name = %s id = %s author = %s", nameOfTheBook, id, Author);

	}
}
