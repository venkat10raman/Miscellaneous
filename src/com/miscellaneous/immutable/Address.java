package com.miscellaneous.immutable;

public final class Address {
	
	private String name;
	private int pincode;
	private String city;
	
	public Address(String name, int pincode, String city) {
		super();
		this.name = name;
		this.pincode = pincode;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [name=" + name + ", pincode=" + pincode + ", city=" + city + ", toString()=" + super.toString()
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPincode() {
		return pincode;
	}

	public String getCity() {
		return city;
	}

}
