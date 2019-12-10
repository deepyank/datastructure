package com.ex.test;

import com.ex.lineardsImpl.FixedSizeArrayStack;

public class TestMyStack {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FixedSizeArrayStack<Integer> fsas=new FixedSizeArrayStack<>();
		fsas.push(5);
		fsas.push(10);
		fsas.peek();
		System.out.println("***Print Stack after peek***->>>");
		fsas.printStack();
		fsas.pop();
		System.out.println("\n***Print Stack after pop***->>>");
		fsas.printStack();
		
	}

}
