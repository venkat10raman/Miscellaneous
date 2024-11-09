package com.miscellaneous.sdp.flyweight.casea;

public class DemoFlyweight {
	
	private static final int BOOK_TYPES = 2;
	private static final int BOOKS_TO_INSERT = 10000000;

	public static void main(String[] args) {
		Store store = new Store();
		int limit = BOOKS_TO_INSERT / BOOK_TYPES;
		
		for(int i=0 ; i<limit ; i++) {
			store.storeBook(String.valueOf(i), i+10, "Action", "Follett", "Stuff");
			store.storeBook(String.valueOf(i), i+20, "Fantasy", "Ingram", "Extra");
		}
		
		store.displayBooks();
	}

}
