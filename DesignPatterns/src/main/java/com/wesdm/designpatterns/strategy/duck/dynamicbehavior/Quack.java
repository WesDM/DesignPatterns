package com.wesdm.designpatterns.strategy.duck.dynamicbehavior;

public class Quack implements QuackBehavior{
	public void quack(){
		System.out.println("quack");
	}
}
