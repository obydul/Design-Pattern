package com.obydul.templatemethod.simplebarista;

public class Coffee {

	void prepareReceipt() {
		boilWater();
		brewCoffeeGrinds();
		pourInCup();
		addSugarAndMilk();
	}

	public void boilWater() {
		System.out.println("Boiling water");
	}

	public void brewCoffeeGrinds() {
		System.out.println("Dripping coffee  through filter");
	}

	public void pourInCup() {
		System.out.println("Pouring into cup");
	}

	public void addSugarAndMilk() {
		System.out.println("Adding Sugar and Milk");
	}

}
