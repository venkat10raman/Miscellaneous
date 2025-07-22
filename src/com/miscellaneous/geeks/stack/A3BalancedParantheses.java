package com.miscellaneous.geeks.stack;

import java.util.LinkedList;
import java.util.Stack;

public class A3BalancedParantheses {

	public static void main(String[] args) {
		validParantheses("[(){}]");
		validParantheses("[(){}]}");
		
		validParanthesesLL("[(){}]");
		validParanthesesLL("[(){}]{}");
		validParanthesesLL("[(){}]}{");
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
		}
	}
	
	private static void validParanthesesLL(String input) {
		LinkedList<Character> ll = new LinkedList<>();
		boolean isValid = true;
		for(Character ch : input.toCharArray()) {
			if(ch == '(' || ch == '{' || ch == '[') {
				ll.add(ch);
			} else if(!ll.isEmpty() && (
					(ll.getLast() == '(' && ch == ')')
					|| (ll.getLast() == '[' && ch == ']')
					|| (ll.getLast() == '{' && ch == '}')
					)) {
				ll.removeLast();
			} else {
				System.out.println(input+" :: is not a valid Parantheses");
				isValid = false;
				break;
			}
		}
		
		if(ll.isEmpty() && isValid) {
			System.out.println(input+" :: is a valid Parantheses");
		}
	}

}
