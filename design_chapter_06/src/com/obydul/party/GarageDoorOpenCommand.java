package com.obydul.party;


public class GarageDoorOpenCommand implements Command{
	GarageDoor garageDoor;

	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.up();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}
}
