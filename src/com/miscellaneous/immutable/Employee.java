package com.miscellaneous.immutable;

//Make class final -> no other class can extend
//Make fields private and final -> to avoid re-initializing
//Make deep copy
//No setters

public final class Employee {
	
	private final String name;
	private final String sex;
	private final int age;
	private final Address address;
	
	public Employee(String name, String sex, int age, Address address) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		
		//deep copy
		this.address = new Address(address.getName(), address.getPincode(), address.getCity());
		
		//shallow-copy avoid
		//this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", sex=" + sex + ", age=" + age + ", address=" + address + ", toString()="
				+ super.toString() + "]";
	}
	
	public Address getAddress() {
		return address;
	}

	public static void main(String[] args) {
		Address address = new Address("DMM", 560037, "Bengaluru");
		Employee emp = new Employee("venkat", "male", 20, address);
		System.out.println(emp.getAddress());
		address.setName("KSR");
		System.out.println(emp.getAddress());
	}

}
