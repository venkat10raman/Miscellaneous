package com.miscellaneous.dp.factory;

public class AnimalFactory {
	
	public Animal getInstance(String animalType) {
		Animal animal = null;
		if(animalType.equalsIgnoreCase("cat")) {
			animal = new Cat();
		} else if(animalType.equalsIgnoreCase("cow")) {
			animal = new Cow();
		} else if(animalType.equalsIgnoreCase("dog")) {
			animal = new Dog();
		}
		return animal;
	}
	
	public static void main(String[] args) {
		AnimalFactory factory = new AnimalFactory();
		factory.getInstance("cat").sound();
		factory.getInstance("cow").sound();
		factory.getInstance("dog").sound();
	}
}
