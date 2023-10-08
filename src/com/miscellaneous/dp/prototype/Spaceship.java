package com.miscellaneous.dp.prototype;

public class Spaceship implements Cloneable {
	
	private String name;
	private Integer crew;
	private Double fuel;
	private Alien captain;
	
	public Spaceship(String name, Integer crew, Double fuel, Alien captain) {
		super();
		this.name = name;
		this.crew = crew;
		this.fuel = fuel;
		this.captain = captain;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//shallow-copy
		//return super.clone();
		
		//deep-copy
		Alien alien = (Alien) captain.clone();
		return new Spaceship(name, crew, fuel, alien);
	}

	public void setCaptain(Alien captain) {
		this.captain = captain;
	}
	
	public Alien getCaptain() {
		return this.captain;
	}

	@Override
	public String toString() {
		return "Spaceship ["
				+ "name=" + name 
				+ ", crew=" + crew 
				+ ", fuel=" + fuel 
				+ ", captain=" + captain + "]";
	}

}
