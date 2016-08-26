package com.wesdm.designpatterns.stack;

/**
 * A LIFO data structure
 * @author Wesley
 *
 * @param <T>
 */
public class ArrayStack<T> implements Stack<T> {
	private int stackPointer = -1;
	@SuppressWarnings("unchecked")
	private T[] stack = (T[]) new Object[1000];

	@Override
	public void push(T o) {
		if (stackPointer < stack.length) {
			stack[++stackPointer] = o;
		} else {
			throw new RuntimeException();
		}
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
			throw new RuntimeException();

		}
	}

	@Override
	public boolean isEmpty() {
		return stackPointer == -1;
	}

}
