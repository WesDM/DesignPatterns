package com.wesdm.designpatterns.creational.factory.ingredientfactory;

import com.wesdm.designpatterns.creational.factory.ingredients.Dough;
import com.wesdm.designpatterns.creational.factory.ingredients.MarinaraSauce;
import com.wesdm.designpatterns.creational.factory.ingredients.Sauce;
import com.wesdm.designpatterns.creational.factory.ingredients.ThinCrustDough;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		// TODO Auto-generated method stub
		return new ThinCrustDough();
	}

	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new MarinaraSauce();
	}
}
