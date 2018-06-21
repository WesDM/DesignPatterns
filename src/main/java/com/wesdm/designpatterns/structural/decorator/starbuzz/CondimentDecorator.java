package com.wesdm.designpatterns.structural.decorator.starbuzz;

/**
 * Decorators implement the same abstract class or interface as the component they will decorate
 * 
 * Each decorator HAS-A (wraps) a component
 * 
 * Java IO package uses decorator
 * 
 * @author Wesley
 *
 */
public abstract class CondimentDecorator extends Beverage {
	
	public abstract String getDescription();
	public abstract Size getSize();
}
