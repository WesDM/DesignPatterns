package com.wesdm.designpatterns.decorator.starbuzz;

public class DarkRoast extends Beverage {
	
	public DarkRoast(){
		super("Dark Roast");
	}

	@Override
	public double cost() {
		return 1.50;
	}

}
