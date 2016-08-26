package com.wesdm.designpatterns.composite;

public class MenuTest {

	public static void main(String[] args) {
		MenuComponent waffleHouse = new Menu("WAFFLE HOUSE", "Breakfast");
		MenuComponent diner = new Menu("DINER", "Lunch");
		MenuComponent cafe = new Menu("CAFE", "Dinner");
		MenuComponent dessert = new Menu("DESSERT", "Dessert");

		MenuComponent allMenus = new Menu("ALL MENUS", "All Menus Combined");
		
		allMenus.add(waffleHouse);
		allMenus.add(diner);
		allMenus.add(cafe);
		
		waffleHouse.add(new MenuItem("Waffles","Syrupy goodness",true,3.50));
		diner.add(new MenuItem("Burger","Meat is murder",false,5.00));
		cafe.add(new MenuItem("Steak","Bloody goodness",false,11.50));
		dessert.add(new MenuItem("Cake","Good even when it's not your birthday",false,2.50));
		diner.add(dessert);
		
		Waitress waitress = new Waitress(allMenus);
		waitress.printAllMenus();
		
		waitress.printVegetarianMenu();
	}

}
