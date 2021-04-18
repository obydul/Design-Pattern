package com.obydul.classes;

import com.obydul.abstracts.Pizza;

public class VeggiPizza extends Pizza {
	public VeggiPizza(){
		name = "Veggie Pizza";
		dough = "Crust";
		sauce = "Marinara Sauce";
		toppings.add("Shredded mozzarella");
		toppings.add("Grated parmesan");
		toppings.add("Diced onion");
		toppings.add("Sliced mushrooms");
		toppings.add("Sliced red pepper");
		toppings.add("Sliced black olives");
	}

}
