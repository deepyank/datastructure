package com.ex.beans;

public class DLLNode<U> {
	private U data;
	private DLLNode<U> prev;
	private DLLNode<U> next;

	public DLLNode(U data) {
		this.data = data;
		next = null;
		prev = null;
	}

	public U getData() {
		return data;
	}

	public void setData(U data) {
		this.data = data;
	}

	public DLLNode<U> getPrev() {
		return prev;
	}

	public void setPrev(DLLNode<U> prev) {
		this.prev = prev;
	}

	public DLLNode<U> getNext() {
		return next;
	}

	public void setNext(DLLNode<U> next) {
		this.next = next;
	}

}
