package com.wesdm.designpatterns.iterator;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu implements Menu{
	Map<String, MenuItem> menu;
	
	//Menu dessertMenu;		what if you are asked to add a dessert menu to this menu?
	//						at this point it makes sense to refactor using the composite pattern
	//						otherwise we aren't going to have a design that can accomodate further aquistions or submenus
	
	public CafeMenu() {
		menu = new Hashtable<String, MenuItem>();
		addMenuItem("cafe 1");
		addMenuItem("cafe 2");
	}
	
	public void addMenuItem(String item){
		menu.put(item, new MenuItem(item));
	}

	@Override
	public Iterator<MenuItem> iterator() {
		// TODO Auto-generated method stub
		return menu.values().iterator();
	}

}
