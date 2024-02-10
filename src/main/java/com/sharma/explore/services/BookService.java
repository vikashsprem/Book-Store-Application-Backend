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

    private static List<Book> books = new ArrayList<Book>();
//	private static Long idCounter = 0L;
//	static String description = "This is a beautiful description for Book. It combines magic, mysticism, wisdom, and wonder into an inspiring tale of self-discovery. The story follows the journey of the main character, exploring themes of opportunity, reading life's omens, and the pursuit of dreams.";

//	static {
//		books.add(new Book(++idCounter, "The Alchemist", "Paulo Coelho", "Adventure", 1988, 5, 200, "English",60,4f,description));
//		books.add(new Book(++idCounter, "The Kite Runner", "Khaled Hosseini", "Drama", 2003, 5, 200, "English",60,4f,description));
//		books.add(new Book(++idCounter, "The Da Vinci Code", "Dan Brown", "Mystery", 2003, 5, 200, "English",60,4f,description));
//		books.add(new Book(++idCounter, "The Monk Who Sold His Ferrari", "Robin Sharma", "Self-help", 1997, 5, 200, "English",60,4f,description));
//		books.add(new Book(++idCounter, "The God of Small Things", "Arundhati Roy", "Fiction", 1997, 5, 200, "English",60,4f,description));
//		books.add(new Book(++idCounter, "The Great Gatsby", "F. Scott Fitzgerald", "Fiction", 1925, 5, 200, "English",60,4f,description));
//		books.add(new Book(++idCounter, "The Fountainhead", "Ayn Rand", "Philosophical fiction", 1943, 5, 200, "English",60,4f,description));
//		books.add(new Book(++idCounter, "The Catcher in the Rye", "J. D. Salinger", "Fiction", 1951, 5, 200, "English",60,4f,description));
//		books.add(new Book(++idCounter, "The Hobbit", "J. R. R. Tolkien", "Fantasy", 1937, 5, 200, "English",60,4f,description));
//		books.add(new Book(++idCounter, "The Lord of the Rings", "J. R. R. Tolkien", "Fantasy", 1954, 5, 200, "English",60,4f,description));
//		books.add(new Book(++idCounter, "The Little Prince", "Antoine de Saint-Exupéry", "Novella", 1943, 5, 200, "English",60,4f,description));
//
//	}
	
	public List<Book> findAll() {
		return books;
	}
	
	public Book findOne(Long long1) {
		Predicate<? super Book> predicate = books -> books.getId().equals(long1); 
		return books.stream().filter(predicate).findFirst().orElse(null);
	}

	public Book save(Book book) {
		if(book.getId() == null) {
			book.setId((long) (books.size() + 1));
		}
		books.add(book);
		return book;
	}

	public Book deleteById(Long id) {
		Predicate<? super Book> predicate = books -> books.getId().equals(id);
		Book book = books.stream().filter(predicate).findFirst().orElse(null);
		if(book != null) {
			books.remove(book);
		}
		return book;
	}

	public Book update(Book book) {
		Predicate<? super Book> predicate = books -> books.getId().equals(book.getId());
		Book bookToUpdate = books.stream().filter(predicate).findFirst().orElse(null);
		if(bookToUpdate != null) {
			books.remove(bookToUpdate);
			books.add(book);
		}
		return bookToUpdate;
	}
	
	 public Book saveEntity(Book entity) {
	        return repository.save(entity);
	    }

	    public List<Book> getAllEntities() {
	        return repository.findAll();
	    }
}

