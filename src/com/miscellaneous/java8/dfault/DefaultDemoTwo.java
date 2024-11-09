package com.miscellaneous.java8.dfault;

public class DefaultDemoTwo implements MyInterfaceOne, MyInterfaceTwo {

	public static void main(String[] args) {
		DefaultDemoTwo dt = new DefaultDemoTwo();
		dt.display();
		
		System.out.println(MyInterfaceOne.num);
		System.out.println(MyInterfaceTwo.num);
		
		MyInterfaceOne.printHorsePower();
		MyInterfaceTwo.printHorsePower();
	}

	/*
	 *  we can have our own implementation or
	 *  we call either or both parent methods
	 *  
	 */
	@Override
	public void display() {
		MyInterfaceOne.super.display();
		MyInterfaceTwo.super.display();
	}

}
