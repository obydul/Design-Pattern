package com.obydul.classes;

import com.obydul.abstracts.Duck;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I am a model duck");
		
	}

}
