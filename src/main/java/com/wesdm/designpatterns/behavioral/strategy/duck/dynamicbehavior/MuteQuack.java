package com.wesdm.designpatterns.behavioral.strategy.duck.dynamicbehavior;

public class MuteQuack implements QuackBehavior{

	public void quack() {
		System.out.println("Silence");
	}
	
}
