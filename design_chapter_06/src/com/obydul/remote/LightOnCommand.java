package com.obydul.remote;

import com.obydul.party.Command;
import com.obydul.party.Light;

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
