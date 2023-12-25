package com.miscellaneous.abstracto.caseb;

/*
Like C++, an abstract class can contain constructors in Java.
And a constructor of an abstract class is called when an instance
of an inherited class is created.
*/
public class Derived extends Base {
	
	public Derived() {
		System.out.println("Derived Constructor Called");
	}

	@Override
	void fun() {
		System.out.println("Derived fun() called");
	}
	
	public static void main(String args[]) {
 
        Base base = new Derived();
        base.fun();
        
        Derived d = new Derived();
        d.fun();
    }

}
