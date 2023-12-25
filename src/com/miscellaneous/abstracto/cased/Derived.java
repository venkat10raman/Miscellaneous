package com.miscellaneous.abstracto.cased;

/*
Abstract classes can also have final methods
(methods that cannot be overridden)
*/
public class Derived extends Base {
	
	public Derived() {
		System.out.println("Derived Constructor Called");
	}

	public static void main(String args[]) {
 
        Base base = new Derived();
        base.fun();
        
        Derived d = new Derived();
        d.fun();
    }

}
