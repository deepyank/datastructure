package com.ex.lineardsImpl;

public class TestDynamicStackArray {
	public static void main(String[] args) throws Exception {
		DynamicArrayStack<Integer> das=new DynamicArrayStack<>();
		for(int i=1;i<=22;i++)
			das.push(i*5);
		for(int i=1;i<=10;i++)
			das.pop();
		das.printStack();
		
	}
}
