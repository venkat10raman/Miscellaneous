package com.miscellaneous.dsp.decorator.casea;

public class DecoratorDemoA {

	public static void main(String[] args) {
		Pizza pizza = new ChickenTikkaPizza(new BasicPizza());
		//Basic Pizza with chicken topping
		String finishedPizza = pizza.bakePizza();
		System.out.println(finishedPizza);

		pizza = new ChickenTikkaPizza(new ProsciuttoPizza(new BasicPizza()));
		//Basic Pizza with prosciutto with chicken topping
		finishedPizza  = pizza.bakePizza();
		System.out.println(finishedPizza);
	}

}
