package com.example.sprinboot.model;

import org.springframework.data.annotation.Id;

public class Author {
	
	@Id
	private int id;
	private String authorName;
	
	public Author(){
		
	}
	
	public Author(String authorName){
		this.authorName=authorName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	
}
