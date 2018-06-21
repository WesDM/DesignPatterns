package com.wesdm.designpatterns.behavioral.observer;

//Similar to Observable
public interface Subject {
	void registerObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObservers();
}
