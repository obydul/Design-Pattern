package com.obydul.running;

import com.obydul.abstracts.Duck;
import com.obydul.classes.FlyRocketPowered;
import com.obydul.classes.MallardDuck;
import com.obydul.classes.ModelDuck;

public class MiniDuckSimulator1 {
	public static void main(String [] args){
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		Duck model1 = new ModelDuck();
		model1.performFly();
		model1.setFlyBehavior(new FlyRocketPowered());
		model1.performFly();
	}

}
