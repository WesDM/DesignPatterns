package com.wesdm.designpatterns.structural.composite;

import java.util.Iterator;

public class MenuItem implements MenuComponent{
	String name;
	String description;
	double price;
	boolean vegetarian;
	
	public MenuItem(String name, String description, boolean vegetarian, double price) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.vegetarian = vegetarian;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public void print(){
		System.out.print(getName());
		if(isVegetarian()){
			System.out.print("(v)");
		}
		System.out.println(", "+getPrice());
		System.out.println(" -- "+getDescription());
	}

	@Override
	public Iterator<MenuComponent> iterator() {
		return new NullIterator<MenuComponent>();
	}
}
