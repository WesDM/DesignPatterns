package com.wesdm.designpatterns.factory.ingredientfactory;

import com.wesdm.designpatterns.factory.ingredients.Dough;
import com.wesdm.designpatterns.factory.ingredients.PlumTomatoSauce;
import com.wesdm.designpatterns.factory.ingredients.Sauce;
import com.wesdm.designpatterns.factory.ingredients.ThickCrustDough;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		System.out.println("Chicago dough");
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		System.out.println("Chicago sauce");
		// TODO Auto-generated method stub
		return new PlumTomatoSauce();
	}

}
