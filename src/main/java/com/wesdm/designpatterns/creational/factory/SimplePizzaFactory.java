package com.wesdm.designpatterns.creational.factory;

import com.wesdm.designpatterns.creational.factory.pizzas.Pizza;

public class SimplePizzaFactory {
	

	public Pizza createPizza(String type) {
		Pizza pizza = null;
//		if(type.equals("cheese")){
//			pizza = new CheezePizza();
//		} else if(type.equals("pepperoni")){
//			pizza = new PepperoniPizza();
//		}
		return pizza;
	}
}
