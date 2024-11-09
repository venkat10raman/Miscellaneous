package com.miscellaneous.java8.dfault;

public interface MyInterfaceOne {

	public static int num = 100;

	public default void display() {
		System.out.println("display method of MyInterface-One");
	}

	static void printHorsePower() { 
		System.out.println("Horse Power from MyInterface-One is ::: 7272");
	}


}
