package com.obydul.classes;

import com.obydul.abstracts.Duck;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		// super Duck location is another package
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I am real Mallard Duck");
		
	}

}
