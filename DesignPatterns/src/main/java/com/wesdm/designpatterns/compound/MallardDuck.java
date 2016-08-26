package com.wesdm.designpatterns.compound;

public class MallardDuck implements Quackable {
	Observable observable;
	
	public MallardDuck() {
		observable = new Observable(this);
	}
	
	@Override
	public void quack() {
		System.out.println("Quack");
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
