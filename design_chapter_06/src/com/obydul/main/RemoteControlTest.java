package com.obydul.main;

import com.obydul.classes.GarageDoor;
import com.obydul.classes.GarageDoorOpenCommand;
import com.obydul.classes.Light;
import com.obydul.classes.LightOnCommand;
import com.obydul.classes.SimpleRemoteControl;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		GarageDoor garageDoor = new GarageDoor("Test");
		GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
		
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		remote.setCommand(garageOpen);
		remote.buttonWasPressed();
	}

}
