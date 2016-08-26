package com.wesdm.designpatterns.compound;

public class CountingDuckFactory implements DuckFactory {

	@Override
	public Quackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}

	@Override
	public Quackable createDuckCall() {
		return new QuackCounter(new DuckCall());

	}

	@Override
	public Quackable createRubberDuck() {
		return new QuackCounter(new RubberDuck());

	}

	@Override
	public Quackable createGoose() {
		return null;//return new QuackCounter(new MallardDuck());
	}

}
