package com.wesdm.designpatterns.compound;

public interface DuckFactory {
	Quackable createMallardDuck();
	Quackable createDuckCall();
	Quackable createRubberDuck();
	Quackable createGoose();
}
