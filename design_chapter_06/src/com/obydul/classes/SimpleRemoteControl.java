package com.obydul.classes;

import com.obydul.interfaces.Command;

public class SimpleRemoteControl {
	Command slot;
	
	public SimpleRemoteControl() {
	}

	public void setCommand(Command command) {
		this.slot = command;
	}
	
	public void buttonWasPressed(){
		slot.execute();
	}

}
