package com.obydul.simpleremote;

public class SimpleRemoteControl {
	Command slot;
	
	public SimpleRemoteControl() {
		
	}

	public void setCommand(Command command){
		slot = command;
	}
	
	public void buttonWasPressed(){
		slot.execute();
	}
	
	

}
