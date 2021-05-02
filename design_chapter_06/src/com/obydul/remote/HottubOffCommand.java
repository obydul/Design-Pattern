package com.obydul.remote;

public class HottubOffCommand implements Command {
	Hottub hottub;
	
	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	@Override
	public void execute() {
		hottub.cool();
		hottub.off();
	}

}
