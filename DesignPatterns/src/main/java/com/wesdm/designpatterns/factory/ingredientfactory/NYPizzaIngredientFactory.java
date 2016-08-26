package com.wesdm.designpatterns.factory.ingredientfactory;

import com.wesdm.designpatterns.factory.ingredients.Dough;
import com.wesdm.designpatterns.factory.ingredients.MarinaraSauce;
import com.wesdm.designpatterns.factory.ingredients.Sauce;
import com.wesdm.designpatterns.factory.ingredients.ThinCrustDough;

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
