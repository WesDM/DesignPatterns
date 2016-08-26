package com.wesdm.designpatterns.compound;

public interface QuackObservable {
	void registerObserver(Observer o);
	void notifyObservers();
}
