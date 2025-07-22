package com.miscellaneous.geeks.stack;

import java.util.Stack;

public class B6PostfixToInfix {

	public static void main(String[] args) {
		String postfix = "ABC*+DE/-";
		B6PostfixToInfix st = new B6PostfixToInfix();
		st.convert(postfix);
	}
	
	private void convert(String postfix) {
		Stack<String> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < postfix.length(); i++) {
			char ch = postfix.charAt(i);
			
			if(Character.isLetterOrDigit(ch)) {
				stack.push(String.valueOf(ch));
			} else if(isOperator(ch)) {
				String first = stack.pop();
				String second = stack.pop();
				sb = new StringBuilder();
				sb.append("(").append(second).append(ch).append(first).append(")");
				stack.push(sb.toString());
			}
		}
		System.out.println("Postfix :: " + postfix);
		System.out.println("Infix :: " + stack.pop());
	}
	
	private boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }
	
}
