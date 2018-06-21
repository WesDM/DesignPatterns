package com.wesdm.designpatterns.structural.decorator.starbuzz;

public class Mocha extends CondimentDecorator {
	
	private Beverage bev;		//variable for the component this decorator wraps
	private double price;
	private String description;
	
	public Mocha(Beverage bev){
		this.bev = bev;
	}

	@Override
	public String getDescription() {
		return bev.getDescription() + ", Mocha";
	}
	
	@Override
	public Size getSize(){
		return bev.getSize();
	}

	@Override
	public double cost() {
		double cost = bev.cost();
		switch(bev.getSize()){
		case TALL:
			cost += .10;
			break;
		case GRANDE:
			cost += .20;
			break;
		case VENTI:
			cost += .30;
			break;
		default:
			throw new IllegalArgumentException("Size not valid");
		
		}
		return cost;
	}

}
