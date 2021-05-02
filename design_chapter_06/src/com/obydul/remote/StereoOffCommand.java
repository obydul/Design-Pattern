package com.obydul.remote;

import com.obydul.party.Command;

public class StereoOffCommand implements Command {
	Stereo s;
	
	public StereoOffCommand(Stereo s) {
		this.s = s;
	}

	@Override
	public void execute() {
		s.off();
	}
}
