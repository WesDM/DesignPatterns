package com.wesdm.designpatterns.creational.factory;

import com.wesdm.designpatterns.creational.factory.pizzastore.ChicagoStylePizzaStore;
import com.wesdm.designpatterns.creational.factory.pizzastore.PizzaShop;

public class Client {
	public static void main(String[] args){
		PizzaShop shop = new ChicagoStylePizzaStore();
		shop.orderPizza("cheese");		
	}
}
