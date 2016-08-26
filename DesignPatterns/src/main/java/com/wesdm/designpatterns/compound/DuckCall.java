package com.wesdm.designpatterns.compound;

public class DuckCall implements Quackable {
	Observable observable;

	public DuckCall() {
		observable = new Observable(this);
	}

	@Override
	public void quack() {
		System.out.println("Kwak");
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer o) {
		observable.registerObserver(o);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}
}
