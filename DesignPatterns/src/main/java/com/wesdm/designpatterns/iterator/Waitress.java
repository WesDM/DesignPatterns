package com.wesdm.designpatterns.iterator;

import java.util.Iterator;
import java.util.List;

public class Waitress {
	List<Menu> menus;
	
	public Waitress(List<Menu> menus) {
		this.menus = menus;
	}
	
	public void printMenu(){
		for(Menu menu : menus){
			printMenu(menu.getClass().getSimpleName(), menu.iterator());
		}
			
	}

	public void printMenu(String name, Iterator<MenuItem> iterator){
		System.out.println(name);
		while(iterator.hasNext()){
			MenuItem item = iterator.next();
			System.out.println(item.name);
		}
	}
}

