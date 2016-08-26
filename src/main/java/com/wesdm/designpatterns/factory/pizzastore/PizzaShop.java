package com.wesdm.designpatterns.factory.pizzastore;

import com.wesdm.designpatterns.factory.pizzas.Pizza;

public abstract class PizzaShop {

//	Simple factory pattern.  Abstract Factory. The factory is composed with the PizzaShop.
//	SimplePizzaFactory factory;
//	
//	public PizzaShop(SimplePizzaFactory factory){
//		this.factory = factory;
//	}
	
	public Pizza orderPizza(String type){
		Pizza pizza;
		pizza = createPizza(type);
		pizza.prepare();
		return pizza;
	}
	
	//This is the factory method pattern. It delegates creation behavior to subclasses.
	//To create a new pizza shop, extend this class, and supply the implementation for this method.
	public abstract Pizza createPizza(String type);
}