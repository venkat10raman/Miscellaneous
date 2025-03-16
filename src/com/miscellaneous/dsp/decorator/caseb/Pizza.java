package com.miscellaneous.dsp.decorator.caseb;

public interface Pizza {
	
	public String bakePizza();
	
	static Pizza withChickenTikka(Pizza pizza) {
        return new Pizza() {
            @Override
            public String bakePizza() {
                return pizza.bakePizza() + " with chicken";
            }
        };
    }
	
	static Pizza withProsciutto(Pizza pizza) {
		return new Pizza() {

			@Override
			public String bakePizza() {
				return pizza.bakePizza() + " with prosciutto";
			}
		};
	}
}
