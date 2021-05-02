package com.obydul.remote;

import com.obydul.party.Light;

public class LivingroomLightOffCommand implements Command{
	Light l;
	
	public LivingroomLightOffCommand(Light l) {
		this.l = l;
	}

	@Override
	public void execute() {
		l.off();
	}

}
