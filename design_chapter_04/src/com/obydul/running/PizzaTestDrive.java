package com.obydul.running;

import com.obydul.abstracts.Pizza;
import com.obydul.classes.PizzaStore;
import com.obydul.classes.SimplePizzaFactory;

public class PizzaTestDrive {
	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);

		Pizza pizza = store.orderPizza("cheese");
		System.out.println("We ordered a " + pizza.getName() + "\n");

		pizza = store.orderPizza("veggie");
		System.out.println("We ordered a " + pizza.getName() + "\n");
	}

}
