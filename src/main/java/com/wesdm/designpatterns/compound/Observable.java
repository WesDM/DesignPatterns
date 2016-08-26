package com.wesdm.designpatterns.compound;

import java.util.ArrayList;
import java.util.List;

public class Observable implements QuackObservable {
	List<Observer> observers = new ArrayList<>();
	QuackObservable duck;

	public Observable(QuackObservable duck) {
		this.duck = duck;
	}
	
	@Override
	public void notifyObservers() {
		for(Observer o : observers){
			o.update(duck);
		}
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

}
