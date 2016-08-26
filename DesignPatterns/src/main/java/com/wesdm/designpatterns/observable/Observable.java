package com.wesdm.designpatterns.observable;

//Similar to Subject
public interface Observable {
	void addObserver(Observer o);
	void deleteObserver(Observer o);
	void notifyObservers(Object arg);
	void setChanged();
}
