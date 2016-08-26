package com.wesdm.designpatterns.mvc.model;

public interface IHeartModel extends IBeatObservable, IBpmObservable{
	int getHeartRate();
}
