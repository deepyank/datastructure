package com.ex.nonlinearInt;

import com.ex.beans.BinaryTreeNode;

public interface BinaryTreeNodeInt<T> {

	void insertNode(BinaryTreeNode<?> tempNode,T data);

	void deleteNode(T data);

	T searchNode(T data);

	void traverseNode();
}
