package com.obydul.classes;

import com.obydul.abstracts.Pizza;

public class ClamPizza extends Pizza {
	public ClamPizza(){
		name = "Clam Pizza";
		dough = "Thin Crust";
		sauce = "White garlic Sauce";
		toppings.add("Clams");
		toppings.add("Grated Parmesan cheese");
	}

}
