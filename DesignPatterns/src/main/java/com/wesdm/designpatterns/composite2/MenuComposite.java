package com.wesdm.designpatterns.composite2;

public interface MenuComposite {
	default void add(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}

	default void remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}

	default MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}
}
