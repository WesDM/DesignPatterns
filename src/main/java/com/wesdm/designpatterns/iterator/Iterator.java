package com.wesdm.designpatterns.iterator;

//Homegrown Iterator
public interface Iterator<T> {
	boolean hasNext();
	T next();
}
