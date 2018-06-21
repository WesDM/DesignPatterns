package com.wesdm.designpatterns.structural.composite2;

import java.util.Iterator;

import com.wesdm.designpatterns.stack.ArrayStack;
import com.wesdm.designpatterns.stack.Stack;

public class CompositeIterator implements Iterator<MenuComponent>{
	Stack<Iterator<MenuComponent>> stack = new ArrayStack<>();
	
	public CompositeIterator(Iterator<MenuComponent> iterator) {
		stack.push(iterator);
	}

	@Override
	public boolean hasNext() {
		if(stack.isEmpty()){
			return false;
		} else {
			if(!stack.peek().hasNext()){
				stack.pop();
				return hasNext();
			} else {
				return true;
			}
		}
	}

	@Override
	public MenuComponent next() {
		if(hasNext()){
			MenuComponent component = stack.peek().next();
			if(component instanceof Menu){
				stack.push(component.iterator());
			}
			return component;
		} else {
			return null;
		}
	}



}
