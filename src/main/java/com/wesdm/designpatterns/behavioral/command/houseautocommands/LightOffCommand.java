package com.wesdm.designpatterns.behavioral.command.houseautocommands;

import com.wesdm.designpatterns.behavioral.command.houseitems.Light;

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
