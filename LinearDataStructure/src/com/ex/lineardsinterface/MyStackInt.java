package com.ex.lineardsinterface;

public interface MyStackInt<T> {

	void push(T data)throws Exception;

	T pop()throws Exception;

	T peek();

	boolean isEmpty();

	boolean isFull();
}
