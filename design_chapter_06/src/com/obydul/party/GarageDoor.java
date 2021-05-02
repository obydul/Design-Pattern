package com.obydul.party;

public class GarageDoor {
	String location;
	
	public GarageDoor() {
	}
	public GarageDoor(String location) {
		this.location = location;
	}
	
	public void up(){
		System.out.println(location + " garage Door is up");
	}
	public void down(){
		System.out.println(location + " garage Door is Down");
	}
	public void stop(){
		System.out.println(location + " garage Door is Stopped");
	}
	public void lightOn(){
		System.out.println(location + " garage light is on");
	}
	public void lightOff(){
		System.out.println(location + " garage light is off");
	}
	

}
