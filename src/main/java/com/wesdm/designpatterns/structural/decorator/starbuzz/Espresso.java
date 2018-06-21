package com.wesdm.designpatterns.structural.decorator.starbuzz;

/**
 * Concrete Compenent that we will be adding dynamic behavior to.  Can be used on its own or wrapped in decorator
 * @author Wesley
 *
 */
public class Espresso extends Beverage {
	
	public Espresso(){
		super("Espresso");
	}

	@Override
	public double cost() {
		return 3.50;
	}

}
