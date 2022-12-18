package com.springboot.mongo.api.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.mongo.api.models.Book;

public interface BookRepository extends MongoRepository<Book,Integer> {

}
