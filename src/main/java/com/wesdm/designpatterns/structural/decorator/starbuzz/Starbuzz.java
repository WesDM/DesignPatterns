package com.wesdm.designpatterns.structural.decorator.starbuzz;

import com.wesdm.designpatterns.structural.decorator.starbuzz.Beverage.Size;

public class Starbuzz {

	public static void main(String[] args) {
		Beverage b = new Mocha(new Espresso());
		System.out.println(b.cost());
		System.out.println(b.getDescription());
	}

}
