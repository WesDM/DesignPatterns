package com.wesdm.designpatterns.composite2;

public class MenuTest {

	public static void main(String[] args) {
		MenuComposite waffleHouse = new Menu("WAFFLE HOUSE", "Breakfast");
		MenuComposite diner = new Menu("DINER", "Lunch");
		MenuComposite cafe = new Menu("CAFE", "Dinner");
		MenuComposite dessert = new Menu("DESSERT", "Dessert");

		MenuComposite allMenus = new Menu("ALL MENUS", "All Menus Combined");
		
		allMenus.add((MenuComponent)waffleHouse);
		allMenus.add((MenuComponent)diner);
		allMenus.add((MenuComponent)cafe);
		
		waffleHouse.add(new MenuItem("Waffles","Syrupy goodness",true,3.50));
		diner.add(new MenuItem("Burger","Meat is murder",false,5.00));
		cafe.add(new MenuItem("Steak","Bloody goodness",false,11.50));
		dessert.add(new MenuItem("Cake","Good even when it's not your birthday",false,2.50));
		diner.add((MenuComponent)dessert);
		
		Waitress waitress = new Waitress((MenuComponent)allMenus);
		waitress.printAllMenus();
		
		waitress.printVegetarianMenu();
	}

}
