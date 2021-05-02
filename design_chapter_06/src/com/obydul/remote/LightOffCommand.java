package com.obydul.remote;

import com.obydul.party.Light;

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
