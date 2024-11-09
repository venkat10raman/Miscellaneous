package com.miscellaneous.java8.dfault;

public class DefaultDemoOne implements MyInterfaceOne {

	public static void main(String[] args) {
		DefaultDemoOne idm = new DefaultDemoOne();
		System.out.println(MyInterfaceOne.num);
		System.out.println(MyInterfaceTwo.num);
		
		MyInterfaceOne.printHorsePower();
		MyInterfaceTwo.printHorsePower();
		idm.display();
	}

}
