package com.obydul.remote;

import com.obydul.party.GarageDoor;

public class GarageDoorUpCommand implements Command {
	GarageDoor garageDoor;
	
	

	public GarageDoorUpCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}



	@Override
	public void execute() {
		garageDoor.up();
	}
	
	
	
}