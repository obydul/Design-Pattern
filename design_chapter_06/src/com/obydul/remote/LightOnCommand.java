package com.obydul.remote;

import com.obydul.classes.Light;
import com.obydul.interfaces.Command;

public class LightOnCommand implements Command{
	Light l;
	
	public LightOnCommand(Light l) {
		this.l = l;
	}

	@Override
	public void execute() {
		l.on();
	}

}
