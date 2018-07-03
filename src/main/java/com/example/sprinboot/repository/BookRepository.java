package com.example.sprinboot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.sprinboot.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer> {

}
