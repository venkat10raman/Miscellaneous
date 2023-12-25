package com.miscellaneous.dp.prototype;

public class DemoPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		Alien alien = new Alien("nicolos", 6.6, 80d);
		Spaceship ship = new Spaceship("Vikram", 2, 1000d, alien);
		
		
		System.out.println(ship);
		alien.setName("tesla");
		Spaceship clonedShip = (Spaceship) ship.clone();
		System.out.println(clonedShip.getCaptain());
		
		
		alien.setName("venkat");
		System.out.println(ship.getCaptain());
		System.out.println(clonedShip.getCaptain());
		
	}

}
