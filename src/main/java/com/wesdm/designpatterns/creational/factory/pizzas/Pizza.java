package com.wesdm.designpatterns.creational.factory.pizzas;

import java.util.ArrayList;

import com.wesdm.designpatterns.creational.factory.ingredients.Dough;
import com.wesdm.designpatterns.creational.factory.ingredients.Sauce;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	ArrayList<String> toppings;
	
	//Factory method to delegate how pizza is prepared because ingredients vary per store.
	public abstract void prepare();
	
	public void bake(){
		System.out.println("We can't wait to bake!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
