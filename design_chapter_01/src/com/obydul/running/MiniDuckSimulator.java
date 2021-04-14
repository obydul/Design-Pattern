package com.obydul.running;

import com.obydul.abstracts.Duck;
import com.obydul.classes.MallardDuck;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();

	}

}
