package com.example.sprinboot.service;

import java.util.List;

import com.example.sprinboot.model.Book;

public interface BookService {
	
	public List<Book> getAllBooks();
	
	public Book findBook(int id);
	
	public void deleteBook(int bookId);
	
	public Book addBook(Book book);
	
	public Book updateBook(Book book , int bookId);
	
	
}
