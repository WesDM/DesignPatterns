package com.wesdm.designpatterns.composite;

import java.util.Iterator;

public class NullIterator<T> implements Iterator<T>{

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public T next() {
		return null;
	}

}
