package com.sharma.explore.services;
import com.sharma.explore.model.Book;
import com.sharma.explore.repositories.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class BookService {
    @Autowired
    private BookRepository repository;

	 public Book saveBook(Book entity) {
	        return repository.save(entity);
	    }

	 public List<Book> getAllBooks() {
	        return repository.findAll();
	    }

	 public Book findOne(Long id) {
		 return repository.findById(id).orElse(null);
	 }
}

