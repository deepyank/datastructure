package com.ex.lineardsImpl;

import com.ex.lineardsinterface.MyStackInt;

public class DynamicArrayStack<T> implements MyStackInt<T> {
	protected int capacity;
	protected int top = -1;
	public static final int CAPACITY = 16;
	public static final int MINCAPACITY = 1 << 16;

	protected Object[] mystack;

	public DynamicArrayStack() {
		// TODO Auto-generated constructor stub
		this(CAPACITY);
	}

	public DynamicArrayStack(int capacity) {
		// TODO Auto-generated constructor stub
		mystack = new Object[capacity];
	}

	@Override
	public void push(T data) throws Exception {
		// TODO Auto-generated method stub
		if (isFull()) {
			expand();
		}
		mystack[++top] = data;

	}

	public int size() {
		return (top + 1);
	}

	@SuppressWarnings("unchecked")
	@Override
	public T pop() throws Exception {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			throw new Exception("Stack is empty");
		}
		shrink();
		return (T) mystack[top--];
	}

	@SuppressWarnings("unchecked")
	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return (T) mystack[top];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top == -1;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return top == CAPACITY - 1;
	}
	
	public void printStack() throws Exception {
		if (isEmpty()) {
			throw new Exception("Three is no element in stack");
		}
		int temp=top;
		while (temp>= 0) {
			System.out.print(mystack[temp--] + " ");
		}
	}

	private void expand() {
		int length = size();
		capacity = 3 * length / 2 + 1;
		System.out.println(capacity);
		Object[] newStack = new Object[capacity];
		System.arraycopy(mystack, 0, newStack, 0, length);
		mystack = newStack;
	}

	private void shrink() {
		int length = size();
		if (size() < MINCAPACITY || top << 2 >= size())
			return;
		length += (top << 1);
		if (top < MINCAPACITY)
			length = MINCAPACITY;
		Object[] newStack = new Object[length];
		System.arraycopy(mystack, 0, newStack, 0, top + 1);
		mystack = newStack;
		capacity = length;

	}
}
