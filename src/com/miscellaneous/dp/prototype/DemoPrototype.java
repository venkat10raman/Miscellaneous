package com.miscellaneous.dp.prototype;

public class DemoPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		Alien alien = new Alien("nicolos", 6.6, 80d);
		Spaceship ship = new Spaceship("Vikram", 2, 1000d, alien);
		
		System.out.println(ship);
		Spaceship clonedShip = (Spaceship) ship.clone();
		
		
		alien.setName("tesla");
		System.out.println(ship.getCaptain());
		System.out.println(clonedShip.getCaptain());
		
	}

}
