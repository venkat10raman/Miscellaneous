package com.miscellaneous.dsp.decorator.caseb;

public class DecoratorDemoB {

	public static void main(String[] args) {
		String finishedPizza = PizzaDecorator.bakePizza(new BasicPizza(), Pizza::withChickenTikka, Pizza::withProsciutto);

		//And if you static import PizzaDecorator.bakePizza:
		//String finishedPizza  = bakePizza(new BasicPizza(),Pizza::withChickenTikka, Pizza::withProsciutto);

		System.out.println(finishedPizza);
		finishedPizza = PizzaDecorator.bakePizza(new BasicPizza(), Pizza::withChickenTikka, Pizza::withProsciutto);
		System.out.println(finishedPizza);
		
		finishedPizza = PizzaDecorator.bakePizza(new BasicPizza(), Pizza::withChickenTikka);
		System.out.println(finishedPizza);
		
		finishedPizza = PizzaDecorator.bakePizza(new BasicPizza(), Pizza::withProsciutto);
		System.out.println(finishedPizza);
	}

}
