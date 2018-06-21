package com.wesdm.designpatterns.structural.decorator.starbuzz;

/**
 * Abstract compenent
 * @author Wesley
 *
 */
public abstract class Beverage {
	private String description;
	public enum Size{TALL, GRANDE, VENTI};
	private Size size;
	
	public Beverage(){}
	
	public Beverage(String description) {
		this.description = description;
	}
	
	public String getDescription(){
		return description;
	}
	
	public Size getSize(){
		return size;
	}
	
	public void setSize(Size s){
		size = s;
	}
	
	public abstract double cost();
}
