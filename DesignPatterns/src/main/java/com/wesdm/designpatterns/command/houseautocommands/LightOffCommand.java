package com.wesdm.designpatterns.command.houseautocommands;

import com.wesdm.designpatterns.command.houseitems.Light;

public class LightOffCommand implements Command {
	Light light;
	
	public LightOffCommand(Light light){
		this.light = light;
	}
	
	public void execute() {
		light.off();
	}

	public void undo() {
		light.on();
	}

}
