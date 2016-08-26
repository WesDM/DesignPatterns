package com.wesdm.designpatterns.factory.pizzas;

import com.wesdm.designpatterns.factory.ingredientfactory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
	
	private PizzaIngredientFactory factory;
	
	public CheesePizza(PizzaIngredientFactory factory){
		this.factory = factory;
	}
	

	@Override
	public void prepare() {
		System.out.println("Prepare cheese pizza");
		dough = factory.createDough();
		sauce = factory.createSauce();
	}

}
