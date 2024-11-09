package com.miscellaneous.sdp.flyweight.casea;

import java.util.HashMap;
import java.util.Map;

public class BookFactory {
	
	private static final Map<String, BookType> bookTypes = new HashMap<>();

	public static BookType getBookType(String type, String distribution, String otherData) {
		if(bookTypes.get(type) == null) {
			bookTypes.put(type, new BookType(type, distribution, otherData));
		}
		
		return bookTypes.get(type);
	}
}
