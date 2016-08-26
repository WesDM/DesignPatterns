package com.wesdm.designpatterns.stack;

public interface Stack<T> {
	void push(T o);

	T peek();

	T pop();

	void pushMany(T[] source);

	boolean isEmpty();
}
