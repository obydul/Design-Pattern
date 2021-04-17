package com.obydul.running;

import com.obydul.abstracts.Beverage;
import com.obydul.classes.DarkRoast;
import com.obydul.classes.Espresso;
import com.obydul.classes.HouseBlend;
import com.obydul.classes.Mocha;
import com.obydul.classes.Soy;
import com.obydul.classes.Whip;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println("beverage1 :: " + beverage.getDescription() + " $"
				+ beverage.cost());
		
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println("beverage2 :: " + beverage2.getDescription() + " $"
				+ beverage2.cost());
		// Test

		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println("beverage3 :: " + beverage3.getDescription() + " $"
				+ beverage3.cost());

	}

}
