package com.wesdm.designpatterns.compound;

public class GooseAdapter implements Quackable {
	Goose goose;
	Observable obervable;

	public GooseAdapter(Goose goose) {
		this.goose = goose;
		obervable = new Observable(this);
	}

	@Override
	public void quack() {
		goose.honk();
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer o) {
		obervable.registerObserver(o);
	}

	@Override
	public void notifyObservers() {
		obervable.notifyObservers();
	}

}
