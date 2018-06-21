package com.wesdm.designpatterns.structural.composite;

public interface MenuLeaf {
	default String getName(){
		throw new UnsupportedOperationException();
	}
	
	default String getDescription(int i){
		throw new UnsupportedOperationException();
	}
	
	default double getPrice(){
		throw new UnsupportedOperationException();
	}
	
	default boolean isVegetarian(){
		throw new UnsupportedOperationException();
	}
	
	default void print(){
		throw new UnsupportedOperationException();
	}
}
