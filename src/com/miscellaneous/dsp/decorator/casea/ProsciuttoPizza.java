package com.miscellaneous.dsp.decorator.casea;

public class ProsciuttoPizza extends PizzaDecorator {

	protected ProsciuttoPizza(Pizza pizza) {
		super(pizza);
	}
	
	@Override
    public String bakePizza() {
        return super.bakePizza() + " with prosciutto";
    }

}
