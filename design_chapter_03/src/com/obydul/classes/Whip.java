package com.obydul.classes;

import com.obydul.abstracts.Beverage;
import com.obydul.abstracts.CondimentDecorator;

public class Whip extends CondimentDecorator {
	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription()+", whip";
	}

	@Override
	public double cost() {
		return .10 + beverage.cost();
	}

}
