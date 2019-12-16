package com.ex.beans;

public class BinaryTreeNode<T extends Comparable<T>> {
	private T data;
	private BinaryTreeNode<T> left, right;

	public BinaryTreeNode(T data) {
		// TODO Auto-generated constructor stub
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public BinaryTreeNode<T> getLeft() {
		return left;
	}

	public void setLeft(BinaryTreeNode<T> left) {
		this.left = left;
	}

	public BinaryTreeNode<T> getRight() {
		return right;
	}

	public void setRight(BinaryTreeNode<T> right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "BinaryTreeNode [data=" + data + ", left=" + left + ", right=" + right + "]";
	}
	
	

}
