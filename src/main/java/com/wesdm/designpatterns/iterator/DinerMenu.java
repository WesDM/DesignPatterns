package com.wesdm.designpatterns.iterator;

import java.util.Iterator;

public class DinerMenu implements Menu{
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	//Menu dessertMenu;		what if you are asked to add a dessert menu to this menu?
	//						at this point it makes sense to refactor using the composite pattern
	//						otherwise we aren't going to have a design that can accomodate further aquistions or submenus
	
	public DinerMenu(){
		menuItems = new MenuItem[MAX_ITEMS];
		addMenuItem("diner 1");
		addMenuItem("diner 2");
	}
	
	@Override
	public Iterator<MenuItem> iterator() {
		return new DinerMenuIterator(menuItems);
	}
	
	//Don't want this because it exposes our internal implementation
//	public MenuItem[] getMenuItems(){
//		
//	}
	
	public void addMenuItem(String item) {
		if(numberOfItems >= MAX_ITEMS || item == null){
			//throw exception
		} else {
			menuItems[numberOfItems++] = new MenuItem(item);
		}
	}
}
