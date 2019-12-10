package com.ex.lineardsImpl;

import java.util.Iterator;

import com.ex.customexception.LinkedListException;
import com.ex.lineardsinterface.Mapper;
import com.ex.lineardsinterface.MyList;

class Node<U> {
	private U data;
	Node<U> next;

	public Node(U data) {
		// TODO Auto-generated constructor stub
		this.data = data;
		next = null;
	}

	public U getData() {
		return data;
	}

	public void setData(U data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}

}

class MyLinkedList<T> implements MyList<T> {
	protected Node<T> head;

	public MyLinkedList() {
		// TODO Auto-generated constructor stub
		head = null;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		Node<T> currNode = head;
		int size = 0;
		while (currNode != null) {
			currNode = currNode.next;
			size++;
		}
		return size;
	}

	@Override
	public T get(int index) throws LinkedListException {
		// TODO Auto-generated method stub
		if (getCount() < index)
			throw new LinkedListException("index out of bound exception");
		Node<T> currNode = head;
		for (int i = 0; i < index; i++) {
			currNode = currNode.next;
		}
		return currNode.getData();
	}

	@Override
	public T getFirst() throws LinkedListException {
		// TODO Auto-generated method stub
		if (head == null)
			throw new LinkedListException("No such element found in linked list");
		return head.getData();
	}

	@Override
	public T getLast() throws LinkedListException {
		// TODO Auto-generated method stub
		if (head == null)
			throw new LinkedListException("No such element found in linked list");
		Node<T> currNode = head.next;
		while (currNode != null) {
			currNode = currNode.next;
		}
		return currNode.getData();
	}

	@Override
	public T getMiddle() throws LinkedListException {
		// TODO Auto-generated method stub
		if (head == null)
			throw new LinkedListException("No such element found in linked list");
		int lenght = getCount();
		T data;
		Node<T> currNode = head.next;
		if (lenght > 0 && lenght % 2 == 0) {
			data = get(lenght % 2);
		} else {
			data = get(lenght % 2 + 1);
		}

		return data;

	}

	private T getMiddleNode(int mid) {
		Node<T> currNode = head;
		for (int i = 0; i < mid; i++) {
			currNode = currNode.next;
		}
		return currNode.getData();
	}

	@Override
	public void addFirst(T item) {
		// TODO Auto-generated method stub
		Node<T> newNode = new Node<>(item);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	@Override
	public void add(T item) {
		// TODO Auto-generated method stub
		Node<T> newNode = new Node<>(item);
		if (head == null) {
			head = newNode;
		} else {
			Node<T> currNode = head;
			while (currNode.next != null)
				currNode = currNode.next;
			currNode.next = newNode;
		}
	}

	@Override
	public void addMiddle(T item) throws LinkedListException {
		// TODO Auto-generated method stub
		if (head == null) {
			throw new LinkedListException("Element cannot insert in middle because list is null");
		} else {
			Node<T> newNode = new Node<>(item);
			int length = getCount();
			int mid = length / 2;
			if (length > 0 && length % 2 == 0) {
				insertAtMiddleNode(mid, newNode);
			} else {
				insertAtMiddleNode(mid + 1, newNode);
			}
		}

	}

	private void insertAtMiddleNode(int mid, Node<T> newNode) {
		Node<T> currNode = head;
		Node<T> previousNode = currNode;
		for (int i = 0; i < mid; i++) {
			previousNode = currNode;
			currNode = currNode.next;
		}
		previousNode.next = newNode;
		newNode.next = currNode;
	}

	@Override
	public void insert(int index, T item) throws LinkedListException {
		// TODO Auto-generated method stub
		int length = getCount();
		if (length >= index) {
			Node<T> currNode = head;
			Node<T> newNode = new Node<>(item);
			for (int i = 1; i < index; i++) {
				currNode = currNode.next;
			}
			newNode.next = currNode.next;
			currNode.next = newNode;
		} else {
			throw new LinkedListException("Index out of bound exception");
		}
	}

	@Override
	public void set(int index, T item) throws LinkedListException {
		// TODO Auto-generated method stub
		int length = getCount();
		if (length >= index) {
			Node<T> currNode = head;
			for (int i = 0; i < index; i++) {
				currNode = currNode.next;
			}
			currNode.setData(item);
		} else {
			throw new LinkedListException("Index out of bound exception");
		}
	}

	@Override
	public void removeFirst() throws LinkedListException {
		// TODO Auto-generated method stub
		if (head == null) {
			throw new LinkedListException("No such element found in list ");
		}
		Node<T> currNode = head;
		if (currNode != null) {
			head = currNode.next;
			currNode.next = null;
		}

	}

	@Override
	public void removeLast() throws LinkedListException {
		// TODO Auto-generated method stub
		if (head == null) {
			throw new LinkedListException("No such element found in list ");
		}
		Node<T> currNode = head;
		Node<T> successorNode = head.next, q = null;
		if (successorNode == null) {
			head = null;
			System.out.println("Node is deleted");
		}
		while ((successorNode = currNode.next) != null) {
			q = currNode;
			currNode = successorNode;
		}
		q.next = null;
	}

	@Override
	public void removeAt(int index) throws LinkedListException {
		// TODO Auto-generated method stub
		int length = getCount();
		if (index < 0) {
			index = 0;
		}
		if (index >= length) {
			index = length - 1;
		}
		if (head == null)
			throw new LinkedListException("No such element in linked list");
		if (index == 0)
			head = head.next;
		else {
			Node<T> tempNode = head;
			for (int i = 0; i < index; i++) {
				tempNode = tempNode.next;
			}
			tempNode = tempNode.next.next;
		}

	}

	@Override
	public <U> MyList<U> map(Mapper<T, U> f) {
		// TODO Auto-generated method stub
		return null;
	}
}

public class TestLinkedList {

	public static void main(String[] args) throws LinkedListException {
		MyLinkedList<Integer> mylist = new MyLinkedList<>();
		mylist.add(20);
		mylist.addFirst(15);
		mylist.add(25);
		mylist.addMiddle(22);
		mylist.addMiddle(21);
		mylist.addMiddle(23);
		mylist.insert(2, 29);
		mylist.insert(1, 10);
		System.out.println(mylist.head);

	}

}
