package com.ex.lineardsinterface;

public interface DLLNodeInt<T> extends Iterable<T> {
	void addFirst(T data);

	void addLast(T data);

	void addMiddle(T data);

	void insertAt(int index, T data);

	void deleteFirst();

	void deleteLast();

	void deleteAt(int index);

	void delete(T data);

	T getFirst();

	T getLast();

	T getMiddle();

	T getAt(int index);
}
