package com.obydul.classes;

import com.obydul.abstracts.Pizza;

public class CheesePizza extends Pizza {
	public CheesePizza(){
		name = "Cheese Pizza";
		dough = "Regular Crust";
		sauce = "Marinara Pizza Sauce";
		toppings.add("Fresh Mozzarella");
		toppings.add("Parmesan");
	}

}
