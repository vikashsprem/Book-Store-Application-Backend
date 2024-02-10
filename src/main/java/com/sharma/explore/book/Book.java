package com.sharma.explore.book;


public class Book {
	private Long id;
    private String title;
    private String author;
    private String genre;
    private int publicationYear;

	 private int quantity;

	 private int price;

	 private String language;

	public Book(Long id, String title, String author, String genre, int publicationYear, int quantity, int price, String language) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.publicationYear = publicationYear;
		this.quantity = quantity;
		this.price = price;
		this.language = language;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
}