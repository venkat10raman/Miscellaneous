package com.miscellaneous.abstracto.casea;

/*
In Java, just like in C++ an instance of an abstract class 
cannot be created, we can have references to abstract class type though. 
*/
public class Derived extends Base {

	@Override
	void fun() {
		System.out.println("Derived fun() called");
	}
	
	public static void main(String args[]) {
 
        // Uncommenting the following line will cause
        // compiler error as the line tries to create an
        // instance of abstract class. 
//		Base b = new Base();
 
        // We can have references of Base type.
        Base base = new Derived();
        base.fun();
    }

}
