package com.obydul.classes;

import com.obydul.abstracts.Pizza;

public class PepperoniPizza extends Pizza {
	public PepperoniPizza(){
		name = "Pepperoni Pizza";
		dough = "Crust";
		sauce = "Marinara Sauce";
		toppings.add("Sliced Onion");
		toppings.add("Grated parmesan cheese");
	}

}
