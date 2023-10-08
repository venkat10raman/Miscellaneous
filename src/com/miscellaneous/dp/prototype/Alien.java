package com.miscellaneous.dp.prototype;

public class Alien implements Cloneable {
	
	private String name;
	private Double height;
	private Double weight;
	
	public Alien(String name, Double height, Double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new Alien(name, height, weight);
	}

	@Override
	public String toString() {
		return "Alien ["
				+ "name=" + name 
				+ ", height=" + height 
				+ ", weight=" + weight 
				+ "]";
	}
	
}
