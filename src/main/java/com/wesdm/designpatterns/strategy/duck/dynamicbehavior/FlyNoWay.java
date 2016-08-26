package com.wesdm.designpatterns.strategy.duck.dynamicbehavior;

public class FlyNoWay implements FlyBehavior {

	public void fly() {
		System.out.println("I can't fly");
	}

}
