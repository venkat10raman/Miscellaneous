package com.miscellaneous.dsp.decorator.casea;

public abstract class PizzaDecorator implements Pizza {
	
	private final Pizza pizza;
	    
    protected PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

	@Override
	public String bakePizza() {
		return pizza.bakePizza();
	}

}
