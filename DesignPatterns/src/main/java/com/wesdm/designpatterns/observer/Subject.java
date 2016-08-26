package com.wesdm.designpatterns.observer;

//Similar to Observable
public interface Subject {
	void registerObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObservers();
}
