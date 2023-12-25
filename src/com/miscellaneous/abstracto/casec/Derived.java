package com.miscellaneous.abstracto.casec;

/*
we can have an abstract class without any abstract method.
This allows us to create classes that cannot be instantiated 
but can only be inherited.
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
