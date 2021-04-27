package com.obydul.classes;

import com.obydul.interfaces.Command;

public class LightOnCommand implements Command{
	Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
		
	}

}
