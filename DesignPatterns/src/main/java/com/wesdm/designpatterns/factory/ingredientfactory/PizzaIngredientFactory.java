package com.wesdm.designpatterns.factory.ingredientfactory;

import com.wesdm.designpatterns.factory.ingredients.Dough;
import com.wesdm.designpatterns.factory.ingredients.Sauce;

//Encapsulate family of ingredients (products). Abstract factory.
public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	//more ingredients...
}
