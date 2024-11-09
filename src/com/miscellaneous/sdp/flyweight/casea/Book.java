package com.miscellaneous.sdp.flyweight.casea;


public class Book {

	private final String name;
	private final double price;
	private final BookType type;
	
	public Book(String name, double price, BookType type) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public BookType getType() {
		return type;
	}
	
}
