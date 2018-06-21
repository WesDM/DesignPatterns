package com.wesdm.designpatterns.behavioral.iterator;

//Homegrown Iterator
public interface Iterator<T> {
	boolean hasNext();
	T next();
}
