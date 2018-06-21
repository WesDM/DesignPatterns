package com.wesdm.designpatterns.creational.factory.pizzas;

import com.wesdm.designpatterns.creational.factory.ingredientfactory.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza{

	
	private PizzaIngredientFactory factory;
	
	public PepperoniPizza(PizzaIngredientFactory factory){
		this.factory = factory;
	}
	

	@Override
	public void prepare() {
		dough = factory.createDough();
		sauce = factory.createSauce();
	}



}
