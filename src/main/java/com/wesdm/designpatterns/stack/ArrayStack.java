package com.wesdm.designpatterns.stack;

/**
 * A LIFO data structure. ArrayDeque has the best performance for stack and queue.
 * 
 * @author Wesley
 *
 * @param <T>
 */
public class ArrayStack<T> implements Stack<T> {
	private int stackPointer =-1;
	@SuppressWarnings("unchecked")
	private T[] stack;

	public ArrayStack() {
		stack = (T[]) new Object[2];
	}

	@Override
	public void push(T o) {
		if (stackPointer >= stack.length) {
			T[] tmp = (T[]) new Object[stackPointer*2];
			System.arraycopy(stack, 0, tmp, 0, stackPointer);
			stack = tmp;
		}
		stack[++stackPointer] = o;
	}

	@Override
	public T peek() {
		if (!isEmpty()) {
			return stack[stackPointer];
		} else {
			throw new RuntimeException();

		}
	}

	@Override
	public T pop() {
		if (!isEmpty()) {
			T ele = stack[stackPointer];
			stack[stackPointer--] = null;
			return ele;
		} else {
			throw new RuntimeException();

		}
	}

	@Override
	public void pushMany(T[] source) {
		if (stackPointer + source.length <= stack.length) {
			System.arraycopy(source, 0, stack, stackPointer + 1, source.length);
			stackPointer += source.length;
		} else {
			//TODO: resize
			throw new RuntimeException();

		}
	}

	@Override
	public boolean isEmpty() {
		return stackPointer == -1;
	}

}
