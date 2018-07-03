package com.example.sprinboot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.sprinboot.model.Author;

public interface AuthorRepository extends MongoRepository<Author, Integer> {

}
