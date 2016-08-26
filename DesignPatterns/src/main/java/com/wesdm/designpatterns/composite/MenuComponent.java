package com.wesdm.designpatterns.composite;

/**
 * This composite pattern breaks the single responsibility principle in exchange
 * for transparency. By allowing child management operation and leaf operations,
 * the client can treat both composite and leaf nodes uniformly. Whether an
 * element is composite or leaf becomes transparent to the client. We lose
 * safety in that a client could add something meaningless to a leaf node, but
 * we gain transparency in it's place. To gain safety, split the behaviors into
 * interfaces. This forces the use of conditional statements and the instanceof
 * operator.
 * 
 * Check out the com.wesdm.designpatterns.composite2 for a different flavor of
 * composite pattern
 * 
 * @author Wesley
 *
 */
public interface MenuComponent extends Iterable<MenuComponent> {

	default void add(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}

	default void remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}

	default MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}

	default String getName() {
		return "";
	}

	default String getDescription(int i) {
		return "";
	}

	default double getPrice() {
		return 0;
	}

	default boolean isVegetarian() {
		return false;
	}

	default void print() {
		throw new UnsupportedOperationException();
	}
}
