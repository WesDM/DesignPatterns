package com.wesdm.designpatterns.command.houseautocommands;

import com.wesdm.designpatterns.command.houseitems.Light;

public class LightOnCommand implements Command{
	Light light;
	
	public LightOnCommand(Light light){
		this.light = light;
	}
	
	public void execute() {
		light.on();
	}

	public void undo() {
		light.off();
	}

}
