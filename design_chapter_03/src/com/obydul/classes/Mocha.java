package com.obydul.classes;

import com.obydul.abstracts.Beverage;
import com.obydul.abstracts.CondimentDecorator;

public class Mocha extends CondimentDecorator{
	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription()+", Mocha";
	}

	@Override
	public double cost() {
		return .20 + beverage.cost();
	}

}
