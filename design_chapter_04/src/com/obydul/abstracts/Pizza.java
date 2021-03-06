package com.obydul.abstracts;

import java.util.ArrayList;

public abstract class Pizza {
	public String name;
	public String dough;
	public String sauce;
	public ArrayList toppings = new ArrayList();

	public String getName() {
		return name;
	}

	public void prepare() {
		System.out.println("Preparing " + name);
	}

	public void bake() {
		System.out.println("Baking " + name);
	}

	public void cut() {
		System.out.println("Cutting " + name);
	}

	public void box() {
		System.out.println("Boxing " + name);
	}

	@Override
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		for (int i = 0; i < toppings.size(); i++) {
			display.append((String) toppings.get(i) + "\n");
		}
		return super.toString();
	}

}
