package com.wesdm.designpatterns.stack;

//Deque<Integer> stack = new ArrayDeque<Integer>(); preferred Java impl as of 7

public class MonitorableStack<T> implements Stack<T> {
	private int highWaterMark = 0;
	private int currentSize;
	Stack<T> stack = new ArrayStack<>();

	public void push(T o) {
		if (++currentSize > highWaterMark)
			highWaterMark = currentSize;
		stack.push(o);
	}

	public T pop() {
		--currentSize;
		return stack.pop();
	}

	public void pushMany(T[] source) {
		if (currentSize + source.length > highWaterMark)
			highWaterMark = currentSize + source.length;
		stack.pushMany(source);
	}

	public int maximumSize() {
		return highWaterMark;
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
}