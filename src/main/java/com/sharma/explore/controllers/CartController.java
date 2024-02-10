package com.sharma.explore.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sharma.explore.model.Book;
import com.sharma.explore.services.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {

	@Autowired
	CartService cartService;

	@GetMapping("/add/{id}")
	public String retrieveBook(@PathVariable int id) {
		cartService.addBooks(id);
		return "Books have been added";
	}

	@GetMapping("/books")
	public List<Book> retrieveAllBooks() {
		return cartService.getBooks();
	}

	@GetMapping("/remove/{id}")
	public String removeBook(@PathVariable int id) {
		cartService.removeBooks(id);
		return "Books have been removed";
	}

	@GetMapping("/clear")
	public String clearCart() {
		cartService.clearCart();
		return "Cart has been cleared";
	}

	@GetMapping("/size")
	public int getCartSize() {
		return cartService.getCartSize();
	}

	@GetMapping("/total")
	public double getCartTotal() {
		return cartService.getCartTotal();
	}

}
