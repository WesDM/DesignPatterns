package com.wesdm.designpatterns.command.houseautocommands;

import com.wesdm.designpatterns.command.houseitems.Stereo;

public class StereoOffCommand implements Command {
	Stereo stereo;
	
	public StereoOffCommand(Stereo stereo){
		this.stereo = stereo;
	}

	public void execute() {
		stereo.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
