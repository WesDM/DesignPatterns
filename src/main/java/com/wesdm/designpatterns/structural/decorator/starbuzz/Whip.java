package com.wesdm.designpatterns.structural.decorator.starbuzz;

public class Whip extends CondimentDecorator {
	
	private Beverage bev;		//variable for the component this decorator wraps
	private double price;
	private String description;

	public Whip(Beverage bev){
		this.bev = bev;
	}

	@Override
	public String getDescription() {
		return bev.getDescription() + ", Whip";
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

	@Override
	public Size getSize() {
		// TODO Auto-generated method stub
		return bev.getSize();
	}

}
