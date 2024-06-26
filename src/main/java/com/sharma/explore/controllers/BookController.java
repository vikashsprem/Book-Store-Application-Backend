package com.sharma.explore.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sharma.explore.model.Book;
import com.sharma.explore.services.BookService;

@RestController
@RequestMapping("/api")
public class BookController {

	@Autowired
	private BookService bookService;
    
    @PostMapping("/add/book")
    public void addBook(@RequestBody Book entity) {
    	Book book = new Book(
                null, // id will be generated by the database
                entity.getRating(),
                entity.getDescription(),
                entity.getDiscount(),
                entity.getTitle(),
                entity.getAuthor(),
                entity.getGenre(),
                entity.getPublicationYear(),
                entity.getQuantity(),
                entity.getPrice(),
                entity.getLanguage(),
                entity.getImageLink(),
				entity.getBookLink()
            );
		bookService.saveBook(book);
    }

	@GetMapping("/books")
	public List<Book> retrieveAllBooks() {
		return bookService.getAllBooks();
	}

	@GetMapping("/books/{id}")
	public Book retrieveBook(@PathVariable int id) {
		return bookService.findOne((long) id);
	}
}

