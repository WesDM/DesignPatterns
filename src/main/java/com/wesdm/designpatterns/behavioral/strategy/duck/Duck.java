package com.wesdm.designpatterns.behavioral.strategy.duck;

import com.wesdm.designpatterns.behavioral.strategy.duck.dynamicbehavior.FlyBehavior;
import com.wesdm.designpatterns.behavioral.strategy.duck.dynamicbehavior.QuackBehavior;

public abstract class Duck {
	
	//Encapsulating what functionality isn't shared by all ducks/changes by moving that behavior to an interface
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void swim(){
		
	}
	
	//All ducks display, but how is determined by subclass. This should potentially be a Strategy as well.
	public abstract void display();

	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}
	
	//Setters allow to change behavior at runtime, without encapsulation this wouldn't be possible
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
