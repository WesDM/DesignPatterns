package com.wesdm.designpatterns.command.houseautocommands;

import com.wesdm.designpatterns.command.houseitems.Stereo;

public class StereoOnWithCDCommand implements Command {
	Stereo stereo;

	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	public void execute() {
		stereo.on();
		stereo.setCd();
		stereo.setVolume(11);
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
