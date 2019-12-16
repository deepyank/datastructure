package com.ex.stackproblems;

import com.ex.lineardsImpl.DynamicArrayStack;

public class BalancingSymbol {
	private static DynamicArrayStack<Character> das = new DynamicArrayStack<>();

	static boolean isValidSymbolPattern(String s) throws Exception {
		if (s == null)
			return true;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ')') {
				if (!das.isEmpty() || das.peek() == '(') {
					das.pop();
				} else {
					return false;
				}
			} else if (s.charAt(i) == ']') {
				if (!das.isEmpty() || das.peek() == '[') {
					das.pop();
				} else {
					return false;
				}
			} else if (s.charAt(i) == '}') {
				if (!das.isEmpty() || das.peek() == '{') {
					das.pop();
				} else {
					return false;
				}
			} else {
				das.push(s.charAt(i));
			}
		}
		return true;
	}

	public static void main(String[] args) throws Exception {
		String s = "(A+B+(C-D)";
		System.out.println(isValidSymbolPattern(s));
	}
}
