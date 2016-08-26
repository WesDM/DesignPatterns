package com.wesdm.designpatterns.composite2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu implements MenuComposite, MenuComponent{
	List<MenuComponent> menuComponents = new ArrayList<>();
	String name;
	String description;

	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public void add(MenuComponent menuComponent){
		menuComponents.add(menuComponent);
	}

	public void remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}

	public MenuComponent getChild(int i) {
		return menuComponents.get(i);
	}
	
	public String getName(){
		return name;
	}

	public String getDescription(){
		return description;
	}
	
	public void print() {
		System.out.print(getName());
		System.out.println(", "+getDescription());
		
		Iterator<MenuComponent> it = menuComponents.iterator();
		while(it.hasNext()){
			it.next().print();
		}
	}

	@Override
	public Iterator<MenuComponent> iterator() {
		return new CompositeIterator(menuComponents.iterator());
	}

}
