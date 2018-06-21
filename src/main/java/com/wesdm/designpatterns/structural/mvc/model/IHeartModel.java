package com.wesdm.designpatterns.structural.mvc.model;

public interface IHeartModel extends IBeatObservable, IBpmObservable{
	int getHeartRate();
}
