package com.wesdm.designpatterns.command;

import com.wesdm.designpatterns.command.houseautocommands.Command;
import com.wesdm.designpatterns.command.houseautocommands.NoCommand;

public class RemoteControl {

	// Separate implementation from caller. All we know is we have two list of
	// commands and we call execute on one depending on which button pressed
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;

	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];

		Command noCommand = new NoCommand();
		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void onButtonWasPressed(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}

	public void offButtonWasPressed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	public void undoButtonPressed(){
		undoCommand.undo();
	}

	public String toString() {
		StringBuffer buff = new StringBuffer();
		buff.append("***REMOTE CONTROL***\n");
		for (int i = 0; i < onCommands.length; i++) {
			buff.append("Slot " + i + " " + onCommands[i].getClass().getName() + " " + offCommands[i].getClass().getName() + "\n");
		}
		return buff.toString();
	}
}
