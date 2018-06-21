package com.wesdm.designpatterns.behavioral.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MenuTest {
	
	public static void main(String[] args) {
		DinerMenu diner = new DinerMenu();
		WaffleHouseMenu waffle = new WaffleHouseMenu();
		CafeMenu cafe = new CafeMenu();
		
		List<Menu> menus = Arrays.asList(diner, waffle, cafe);
		Waitress waitress = new Waitress(menus);
		waitress.printMenu();
	}

	private static void anotherExample() {
		DinerMenu diner = new DinerMenu();
		
		Iterator<MenuItem> i = diner.iterator();
		while(i.hasNext()){
			System.out.println(i.next().name);
		}
		
		
		//implementing Iterable allows us to use MenuItems in for each
		for(MenuItem item : diner){
			System.out.println(item.name);
		}
	}
}
