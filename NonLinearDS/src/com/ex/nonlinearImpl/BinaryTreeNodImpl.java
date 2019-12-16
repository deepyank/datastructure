package com.ex.nonlinearImpl;

import com.ex.beans.BinaryTreeNode;
import com.ex.nonlinearInt.BinaryTreeNodeInt;

public class BinaryTreeNodImpl<T extends Comparable<T>> implements BinaryTreeNodeInt<T> {

	private BinaryTreeNode<T> root;

	public BinaryTreeNode<?> getRoot() {
		return root;
	}

	public void setRoot(BinaryTreeNode<T> root) {
		this.root = root;
	}

	@Override
	public void insertNode(BinaryTreeNode<?> tempRoot,T data) {
		// TODO Auto-generated method stub
		BinaryTreeNode<T> new_node=new BinaryTreeNode<T>(data);
		if(root==null) {
			root=new_node;
		}
		System.out.println("Where do u want to store new node left or right-->>");
		if(true) {
			BinaryTreeNode<T> left_Node=root.getLeft();
			BinaryTreeNode prevNode=null;
			if(left_Node.getLeft()!=null) {
				prevNode=left_Node;
				insertNode(left_Node, data);
			}
		}else {
			BinaryTreeNode<T> right_Node=root.getLeft();
			BinaryTreeNode prevNode=null;
			if(right_Node.getLeft()!=null) {
				prevNode=right_Node;
				insertNode(right_Node, data);
			}
		}
		
	}

	@Override
	public void deleteNode(T data) {
		// TODO Auto-generated method stub

	}

	@Override
	public T searchNode(T data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void traverseNode() {
		// TODO Auto-generated method stub
		BinaryTreeNode<T> tempNode = root;
		while (tempNode != null) {
			if (tempNode.getRight() != null) {
				System.out.println(tempNode.getData());
				tempNode = tempNode.getRight();
			} else {
				tempNode = tempNode.getLeft();
			}
		}
	}

	public static void main(String[] args) {
		BinaryTreeNodImpl<Integer> btni = new BinaryTreeNodImpl<>();
		btni.insertNode(1);
		btni.insertNode(2);
		btni.insertNode(3);
		btni.insertNode(4);
		btni.insertNode(5);
		btni.insertNode(6);
		btni.insertNode(7);
		btni.traverseNode();

	}
}
