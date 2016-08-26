package com.wesdm.designpatterns.strategy.duck;

import com.wesdm.designpatterns.strategy.duck.dynamicbehavior.FlyNoWay;
import com.wesdm.designpatterns.strategy.duck.dynamicbehavior.Quack;

public class ModelDuck extends Duck {
	
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

	}

}
