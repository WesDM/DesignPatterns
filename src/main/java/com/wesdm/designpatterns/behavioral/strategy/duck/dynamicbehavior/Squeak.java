package com.wesdm.designpatterns.behavioral.strategy.duck.dynamicbehavior;

public class Squeak implements QuackBehavior {

	public void quack() {
		System.out.println("Squeak");
	}

}
