package com.miscellaneous.immutable;

//Make class final -> no other class can extend
//Make fields private and final -> to avoid re-initializing
//Make deep copy
//No setters

/*
The class must be declared as final so that child classes can’t be created.

Data members in the class must be declared private 
so that direct access is not allowed.

Data members in the class must be declared as final 
so that we can’t change the value of it after object creation.

A parameterized constructor should initialize all the fields 
performing a deep copy so that data members can’t be 
modified with an object reference.

Deep Copy of objects should be performed in the 
getter methods to return a copy rather than 
returning the actual object reference)*/

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
