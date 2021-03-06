package com.wesdm.designpatterns.behavioral.command.houseautocommands;

//Encapsulating method invocation. Allows for good use in queueing or logging requests and supporting undoable operations
public interface Command {
	void execute();
	void undo();
}
