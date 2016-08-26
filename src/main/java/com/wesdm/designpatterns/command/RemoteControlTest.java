package com.wesdm.designpatterns.command;

import com.wesdm.designpatterns.command.houseautocommands.Command;
import com.wesdm.designpatterns.command.houseautocommands.LightOffCommand;
import com.wesdm.designpatterns.command.houseautocommands.LightOnCommand;
import com.wesdm.designpatterns.command.houseautocommands.MacroCommand;
import com.wesdm.designpatterns.command.houseautocommands.StereoOffCommand;
import com.wesdm.designpatterns.command.houseautocommands.StereoOnWithCDCommand;
import com.wesdm.designpatterns.command.houseitems.Light;
import com.wesdm.designpatterns.command.houseitems.Stereo;

public class RemoteControlTest {
	public static void main(String[] args) {
		RemoteControl remote = new RemoteControl();
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		Stereo stereo = new Stereo();

		Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
		Command livingRoomLightOff = new LightOffCommand(livingRoomLight);

		Command kitchenLightOn = new LightOnCommand(kitchenLight);
		Command kitchenLightOff = new LightOffCommand(kitchenLight);

		Command stereoOn = new StereoOnWithCDCommand(stereo);
		Command stereoOff = new StereoOffCommand(stereo);

		Command[] partyOn = { livingRoomLightOn, kitchenLightOn, stereoOn };
		Command[] partyOff = { livingRoomLightOff, kitchenLightOff, stereoOff };

		Command partyOnMacro = new MacroCommand(partyOn);
		Command partyOffMacro = new MacroCommand(partyOff);

		remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remote.setCommand(1, kitchenLightOn, kitchenLightOff);
		remote.setCommand(2, stereoOn, stereoOff);
		remote.setCommand(4, partyOnMacro, partyOffMacro);

		System.out.println(remote);

		remote.onButtonWasPressed(0);
		remote.offButtonWasPressed(0);
		remote.undoButtonPressed();
		remote.onButtonWasPressed(1);
		remote.offButtonWasPressed(1);
		remote.onButtonWasPressed(2);
		remote.offButtonWasPressed(2);
		remote.onButtonWasPressed(3);
		remote.offButtonWasPressed(3);
		remote.onButtonWasPressed(4);
		remote.offButtonWasPressed(4);
	}
}
