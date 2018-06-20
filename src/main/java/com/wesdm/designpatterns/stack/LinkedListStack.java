package com.wesdm.designpatterns.stack;

import java.util.EmptyStackException;

public class LinkedListStack<T> implements Stack<T>{
	
	private Node<T> top;
	private int size;
	
	private static class Node<T> {
		T data;
		Node<T> next;

		public Node(T data) {
			this.data = data;
		}
	}
	
	
	
	@Override
	public void push(T o) {
		Node<T> newTop = new Node<T>(o);
		top.next = top;
		top = newTop;
		size++;
	}

	@Override
	public T peek() {
		if(top == null)
			throw new EmptyStackException();
		return top.data;
	}

	@Override
	public T pop() {
		if(top == null)
			throw new EmptyStackException();
		T data = top.data;
		top = top.next;
		size--;
		return data;
	}

	@Override
	public void pushMany(T[] source) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEmpty() {
		return top == null;
	}
	
	public int size() {
		return size;
	}
}
