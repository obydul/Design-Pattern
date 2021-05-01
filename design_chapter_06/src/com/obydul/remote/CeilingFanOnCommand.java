package com.obydul.remote;

import com.obydul.interfaces.Command;

public class CeilingFanOnCommand implements Command {
	CeilingFan ceilingFan;
	
	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		ceilingFan.high();
	}

}
