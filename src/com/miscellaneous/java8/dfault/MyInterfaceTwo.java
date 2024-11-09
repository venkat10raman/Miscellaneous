package com.miscellaneous.java8.dfault;

public interface MyInterfaceTwo {
	
	public static final int num = 200;
	
	public default void display() {
		System.out.println("display method of MyInterface-Two");
	}
	
	static void printHorsePower() { 
		System.out.println("Horse Power from MyInterface-Two is ::: 6262");
	}

}
