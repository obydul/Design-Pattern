package com.obydul.pizzafm;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList toppings = new ArrayList();

	void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough... ");
		System.out.println("Adding sauce... ");
		System.out.println("Adding toppings: ");
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println("	" + toppings.get(i));
		}
	}

	void bake() {
		System.out.println("Bake for 25 minutes at 350 ");
	}

	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	void box() {
		System.out.println("Place Pizza in official PizzaStore box");
	}

	public String getName() {
		return name;
	}

	public String toString() {
		StringBuffer d = new StringBuffer();
		d.append("--- " + name + " ---\n");
		d.append(dough + "\n");
		d.append(sauce + "\n");
		for (int i = 0; i < toppings.size(); i++) {
			d.append((String) toppings.get(i) + "\n");
		}
		return d.toString();
	}

}
