package com.miscellaneous.sdp.composite.caseb;

public class CompositeExample {

	public static void main(String[] args) {

		Employee dev1 = new Developer("David", 1, 1000);
		Employee dev2 = new Developer("Smith", 2, 1200);
		Employee dev3 = new Developer("Cummins", 3, 1500);
		Employee dev4 = new Developer("Green", 4, 1200);
		Employee dev5 = new Developer("Starc", 5, 1500);
		
		Employee lead1 = new Lead("Gilly", 6, 2000);
		lead1.add(dev1);
		lead1.add(dev2);
		lead1.add(dev3);
		
		Employee lead2 = new Lead("Punter", 7, 2000);
		lead2.add(dev4);
		
		Employee manager = new Manager("CA", 8, 30000);
		manager.add(lead1);
		manager.add(lead2);
		manager.add(dev5);
		
		System.out.println(manager.toString());
		System.out.println(lead1.toString());
		System.out.println(lead2.toString());
	}

}
