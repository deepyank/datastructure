package com.ex.lineardsImpl;

import com.ex.lineardsinterface.MyStackInt;

public class FixedSizeArrayStack<T> implements MyStackInt<T> {
	protected int capacity;

	// Default capacity
	public static final int CAPACITY = 10;
	protected Object[] stackRep;
	protected int top = -1;

	public FixedSizeArrayStack() {
		// TODO Auto-generated constructor stub
		this(CAPACITY);
	}

	public FixedSizeArrayStack(int capacity) {
		// TODO Auto-generated constructor stub
		stackRep = new Object[capacity];
	}

	public int size() {
		return (top + 1);
	}

	@Override
	public void push(T data) throws Exception {
		if (isFull()) {
			throw new Exception("Stack is full");
		}
		stackRep[++top] = data;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T pop() throws Exception {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			throw new Exception("Stack is empty");
		}
		return (T) stackRep[top--];
	}

	@SuppressWarnings("unchecked")
	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return (T) stackRep[top];
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
			System.out.print(stackRep[temp--] + " ");
		}
	}
}
