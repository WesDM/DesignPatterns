package com.wesdm.designpatterns.compound;

//Decorator
public class QuackCounter implements Quackable {
	Quackable duck;
	static int numberOfQuacks;
	
	public QuackCounter(Quackable duck) {
		this.duck = duck;
	}
	
	@Override
	public void quack() {
		duck.quack();
		numberOfQuacks++;
	}
	
	public static int getNumberOfQuacks(){
		return numberOfQuacks;
	}

	@Override
	public void registerObserver(Observer o) {
		duck.registerObserver(o);
	}

	@Override
	public void notifyObservers() {
	}

}
