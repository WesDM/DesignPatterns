package com.wesdm.designpatterns.structural.composite;

import java.util.Iterator;

public class Waitress {
	MenuComponent allMenus;

	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}
	
	public void printAllMenus(){
		allMenus.print();
	}
	
	public void printVegetarianMenu(){
		Iterator<MenuComponent> it = allMenus.iterator();
		System.out.println("VEGETARIAN MENU");
		while(it.hasNext()){
			MenuComponent component = it.next();
			if(component.isVegetarian()){
				component.print();
			}
		}
	}
}
