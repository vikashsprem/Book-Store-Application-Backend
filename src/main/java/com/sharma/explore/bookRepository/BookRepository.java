package com.sharma.explore.bookRepository;

import java.util.List;

import com.sharma.explore.book.Book;

public interface BookRepository {
	
	List<Book> findByAuthor(String author);
	List<Book> findByGenre(String genre);
	List<Book> findByAuthorAndPublicationYear(String author, int publicationYear);
}
