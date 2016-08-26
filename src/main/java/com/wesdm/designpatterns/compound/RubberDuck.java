package com.wesdm.designpatterns.compound;

public class RubberDuck implements Quackable {
	Observable observable;
	
	public RubberDuck() {
		observable = new Observable(this);
	}
	
	@Override
	public void quack() {
		System.out.println("Squeak");
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
