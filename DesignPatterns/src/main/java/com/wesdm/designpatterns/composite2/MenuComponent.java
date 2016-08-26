package com.wesdm.designpatterns.composite2;

public interface MenuComponent extends Iterable<MenuComponent>{
	
	default String getName() {
		return "";
	}

	default String getDescription(int i) {
		return "";
	}

	default void print(){}
}
