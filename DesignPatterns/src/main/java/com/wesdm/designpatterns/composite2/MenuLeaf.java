package com.wesdm.designpatterns.composite2;

public interface MenuLeaf extends MenuComponent{
	default double getPrice() {
		return 0;
	}

	default boolean isVegetarian() {
		return false;
	}
}
