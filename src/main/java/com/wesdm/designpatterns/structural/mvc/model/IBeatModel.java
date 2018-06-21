package com.wesdm.designpatterns.structural.mvc.model;

public interface IBeatModel extends IBeatObservable, IBpmObservable{
	void init();
	void on();
	void off();
	void setBpm(int bpm);
	int getBpm();
}
