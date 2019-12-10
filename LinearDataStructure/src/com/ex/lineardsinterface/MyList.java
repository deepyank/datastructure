package com.ex.lineardsinterface;

import com.ex.customexception.LinkedListException;

public interface MyList<T> extends Iterable<T> {
	int getCount();

	T get(int index) throws LinkedListException;

	T getFirst() throws LinkedListException;

	T getLast() throws LinkedListException;

	T getMiddle() throws LinkedListException;

	void addFirst(T item) throws LinkedListException;

	void add(T item);

	void addMiddle(T item) throws LinkedListException;

	void insert(int index, T item) throws LinkedListException;

	void set(int index, T item) throws LinkedListException;

	void removeFirst() throws LinkedListException;

	void removeLast() throws LinkedListException;

	void removeAt(int index) throws LinkedListException;

	<U> MyList<U> map(Mapper<T, U> f);
}
