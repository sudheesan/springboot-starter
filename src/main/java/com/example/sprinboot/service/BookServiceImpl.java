package com.example.sprinboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sprinboot.model.Book;
import com.example.sprinboot.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private  BookRepository bookRepository;
	
	
	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		List<Book> books = bookRepository.findAll();
		return books;
	}

	@Override
	public Book findBook(int id) {
		// TODO Auto-generated method stub
		Optional<Book> book = bookRepository.findById(id);
		if(book.isPresent()){
			return book.get();
		}
		return null;
	}

	@Override
	public void deleteBook(int bookId) {
		// TODO Auto-generated method stub
		Book bookToDelete = findBook(bookId);
		bookRepository.delete(bookToDelete);
	}

	@Override
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		Book bookToSave = bookRepository.save(book);
		return bookToSave;
	}

	@Override
	public Book updateBook(Book bookBody, int bookId) {
		// TODO Auto-generated method stub
		
		Book bookToUpdate = findBook(bookId);
		if(bookBody.getBookName() != null){
			bookToUpdate.setBookName(bookBody.getBookName());
		}
		
		if(bookBody.getAuthor() != null ){
			bookToUpdate.setAuthor(bookBody.getAuthor());
		}
		
		return bookToUpdate;
			
	}
	
	

}
