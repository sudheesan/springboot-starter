package com.example.sprinboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.sprinboot.model.Book;
import com.example.sprinboot.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private  BookService bookService;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ResponseEntity<Book> addNewBook(){
		Book book = new Book();
		book.setBookName("Mobi Dick");
		book = bookService.addBook(book);
		return new ResponseEntity<Book>(book, HttpStatus.CREATED);
		
	}

}
