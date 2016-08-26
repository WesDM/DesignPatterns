package com.wesdm.designpatterns.composite2;

import java.util.Iterator;

public class Waitress {
	MenuComponent allMenus;

	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}

	public void printAllMenus() {

		allMenus.print();
	}

	public void printVegetarianMenu() {
		Iterator<MenuComponent> it = allMenus.iterator();
		System.out.println("VEGETARIAN MENU");
		while (it.hasNext()) {
			MenuComponent component = it.next();
			if (component instanceof MenuLeaf) {
				if (((MenuLeaf)component).isVegetarian()) {
					component.print();
				}
			}
		}
	}
}
