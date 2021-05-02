package com.obydul.remote;

import com.obydul.party.Command;

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
