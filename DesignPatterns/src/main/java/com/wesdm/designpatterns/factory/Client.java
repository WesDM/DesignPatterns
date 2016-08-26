package com.wesdm.designpatterns.factory;

import com.wesdm.designpatterns.factory.pizzastore.ChicagoStylePizzaStore;
import com.wesdm.designpatterns.factory.pizzastore.PizzaShop;

public class Client {
	public static void main(String[] args){
		PizzaShop shop = new ChicagoStylePizzaStore();
		shop.orderPizza("cheese");		
	}
}
