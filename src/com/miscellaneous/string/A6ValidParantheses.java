package com.miscellaneous.string;

import java.util.Stack;

public class A6ValidParantheses {

	public static void main(String[] args) {
		validParantheses("[(){}]");
		validParantheses("[(){}]}");
	}
	
	private static void validParantheses(String input) {
		Stack<Character> stack = new Stack<>();
		boolean isValid = true;
		for(Character c : input.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else if(!stack.empty() &&
					((c == ')' && stack.peek()=='(') ||
					(c == '}' && stack.peek()=='{') ||
					(c == ']' && stack.peek()=='['))) {
				stack.pop();
			} else {
				System.out.println(input+" :: is not a valid Parantheses");
				isValid = false;
				break;
			}
		}
		if(stack.empty() && isValid) {
			System.out.println(input+" :: is a valid Parantheses");
		} else {
			System.out.println(input+" :: is not a valid Parantheses");
		}
	}

}
