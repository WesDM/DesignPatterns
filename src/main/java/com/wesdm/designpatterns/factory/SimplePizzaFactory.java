package com.wesdm.designpatterns.factory;

import com.wesdm.designpatterns.factory.pizzas.Pizza;

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
