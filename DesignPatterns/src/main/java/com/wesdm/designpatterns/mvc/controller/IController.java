package com.wesdm.designpatterns.mvc.controller;

public interface IController {
	void start();
	void stop();
	void increaseBpm();
	void decreaseBpm();
	void setBpm(int bpm);
}
