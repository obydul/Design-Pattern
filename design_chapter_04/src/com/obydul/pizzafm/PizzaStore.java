package com.obydul.pizzafm;

public abstract class PizzaStore {
	abstract Pizza createPizza(String item);

	public Pizza orderPizza(String type) {
		Pizza p = createPizza(type);
		System.out.println("--- Making a " + p.getName() + " ----");
		p.prepare();
		p.bake();
		p.cut();
		p.box();
		return p;
	}
}
