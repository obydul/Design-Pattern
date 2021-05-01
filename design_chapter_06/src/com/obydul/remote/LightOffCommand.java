package com.obydul.remote;

import com.obydul.classes.Light;
import com.obydul.interfaces.Command;

public class LightOffCommand implements Command {
	Light l;
	
	public LightOffCommand(Light l) {
		this.l = l;
	}

	@Override
	public void execute() {
		l.off();
	}

}
