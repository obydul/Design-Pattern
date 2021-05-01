package com.obydul.remote;

import com.obydul.classes.Light;
import com.obydul.interfaces.Command;

public class LivingroomLightOnCommand implements Command {
	Light l;
	
	public LivingroomLightOnCommand(Light l) {
		this.l = l;
	}

	@Override
	public void execute() {
		l.on();
	}
	
}
