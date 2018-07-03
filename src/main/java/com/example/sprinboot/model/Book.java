package com.example.sprinboot.model;

import org.springframework.data.annotation.Id;

public class Book {
	
	@Id
	private int id;
	private String bookName;
	private Author author;
	
	public Book(){
		
	}
	
	public Book(String bookName, Author author){
		this.bookName = bookName;
		this.author=author;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
	

}
