package com.wesdm.designpatterns.factory.pizzastore;

import com.wesdm.designpatterns.factory.ingredientfactory.NYPizzaIngredientFactory;
import com.wesdm.designpatterns.factory.ingredientfactory.PizzaIngredientFactory;
import com.wesdm.designpatterns.factory.pizzas.CheesePizza;
import com.wesdm.designpatterns.factory.pizzas.PepperoniPizza;
import com.wesdm.designpatterns.factory.pizzas.Pizza;

public class NYStylePizzaStore extends PizzaShop{

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory factory = new NYPizzaIngredientFactory();
		if(type.equals("cheese")){
			pizza = new CheesePizza(factory);
		} else if(type.equals("pepperoni")){
			pizza = new PepperoniPizza(factory);
		}
		return pizza;
	}

}
