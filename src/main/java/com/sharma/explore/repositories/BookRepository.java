package com.sharma.explore.repositories;
import com.sharma.explore.model.Book;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    // You can add custom queries here if needed
	List<Book> findAll();
	Book findById(long id);
	List<Book> findByAuthor(String author);
	List<Book> findByGenre(String genre);
	List<Book> findByAuthorAndPublicationYear(String author, int publicationYear);
	List<Book> findByRatingGreaterThan(float rating);
	List<Book> findByRatingLessThan(float rating);
}

