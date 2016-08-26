package com.wesdm.designpatterns.strategy.duck;

import com.wesdm.designpatterns.strategy.duck.dynamicbehavior.FlyWithWings;
import com.wesdm.designpatterns.strategy.duck.dynamicbehavior.Quack;

public class MallardDuck extends Duck {
	
	public MallardDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
	public void fly(){
		System.out.println("Fluck Dying");
	}
}
