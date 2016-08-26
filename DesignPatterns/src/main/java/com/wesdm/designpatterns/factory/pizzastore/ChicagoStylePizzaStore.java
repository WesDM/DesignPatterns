package com.wesdm.designpatterns.factory.pizzastore;

import com.wesdm.designpatterns.factory.ingredientfactory.ChicagoPizzaIngredientFactory;
import com.wesdm.designpatterns.factory.ingredientfactory.PizzaIngredientFactory;
import com.wesdm.designpatterns.factory.pizzas.CheesePizza;
import com.wesdm.designpatterns.factory.pizzas.PepperoniPizza;
import com.wesdm.designpatterns.factory.pizzas.Pizza;

public class ChicagoStylePizzaStore extends PizzaShop{
	

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory factory = new ChicagoPizzaIngredientFactory();
		System.out.println("Create Chicago Pizza");
		if(type.equals("cheese")){
			pizza = new CheesePizza(factory);
		} else if(type.equals("pepperoni")){
			pizza = new PepperoniPizza(factory);
		}
		return pizza;
	}

}
