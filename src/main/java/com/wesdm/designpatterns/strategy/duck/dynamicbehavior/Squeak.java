package com.wesdm.designpatterns.strategy.duck.dynamicbehavior;

public class Squeak implements QuackBehavior {

	public void quack() {
		System.out.println("Squeak");
	}

}
