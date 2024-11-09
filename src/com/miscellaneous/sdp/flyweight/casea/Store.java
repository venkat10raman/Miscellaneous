package com.miscellaneous.sdp.flyweight.casea;

import java.util.ArrayList;
import java.util.List;

public class Store {
	
	private final List<Book> bookList = new ArrayList<>();
	
	public void storeBook(String name, double price, String type,
			String distribution, String otherData) {
		BookType bookType = BookFactory.getBookType(type, distribution, otherData);
		bookList.add(new Book(name, price, bookType));
	}

	public void displayBooks() {
		System.out.println(bookList.size() + " Books Inserted");
	}

}
