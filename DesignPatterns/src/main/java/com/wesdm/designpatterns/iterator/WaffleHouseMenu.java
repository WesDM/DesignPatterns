package com.wesdm.designpatterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WaffleHouseMenu implements Menu{
	List<MenuItem> menu;
	
	//Menu dessertMenu;		what if you are asked to add a dessert menu to this menu?
	//						at this point it makes sense to refactor using the composite pattern
	//						otherwise we aren't going to have a design that can accomodate further aquistions or submenus
	
	public WaffleHouseMenu() {
		menu = new ArrayList<MenuItem>();
		addMenuItem("waffle 1");
		addMenuItem("waffle 2");
	}
	
	public void addMenuItem(String item){
		menu.add(new MenuItem(item));
	}

	@Override
	public Iterator<MenuItem> iterator() {
		// TODO Auto-generated method stub
		return menu.iterator();
	}

}
