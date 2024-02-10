package com.sharma.explore.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sharma.explore.model.Book;

@Service
public class CartService {

	@Autowired
	private BookService service;

	List<Book> cartBooks = new ArrayList<Book>();

	public List<Book> getBooks() {
		return cartBooks;
	}

	public void addBooks(int id) {
		cartBooks.add(service.findOne(Long.valueOf(id)));
	}

	public void removeBooks(int id) {
		cartBooks.remove(service.findOne(Long.valueOf(id)));
	}

	public void clearCart() {
		cartBooks.clear();
	}

	public int getCartSize() {
		return cartBooks.size();
	}

	public double getCartTotal() {
		double total = 0;
		for(Book book : cartBooks) {
			total += book.getPrice();
		}
		return total;
	}

}
