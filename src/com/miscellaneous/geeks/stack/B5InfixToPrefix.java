package com.miscellaneous.geeks.stack;

import java.util.Stack;

public class B5InfixToPrefix {

	public static void main(String[] args) {
		String infix = "A+(B*C-(D/E^F)*G)*H";
		B5InfixToPrefix st = new B5InfixToPrefix();
		st.infixToPrefix(infix);
		st.infixToPrefix("F+D-C*(B+A)");
	}
	
	private void infixToPrefix(String infix) {
		StringBuilder sb = new StringBuilder(infix).reverse();
		char[] chars = sb.toString().toCharArray();
		
		for (int i = 0; i < chars.length; i++) {
			if(chars[i] == '(') {
				chars[i] = ')';
			} else if(chars[i] == ')') {
				chars[i] = '(';
			}
		}
		
		String reversedInfix = new String(chars);
		String postfix = infixToPostfix(reversedInfix);
		
		sb = new StringBuilder();
		sb.append(postfix).reverse();
		System.out.println("Infix: " + infix);
        System.out.println("Prefix: " + sb.toString());
        System.out.println("------------");
	}
	
	private String infixToPostfix(String infix) {
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < infix.length(); i++) {
			char ch = infix.charAt(i);
			
			if(Character.isLetterOrDigit(ch)) {
				sb.append(ch);
			} else if(ch == '(') {
				stack.push(ch);
			} else if(ch == ')') {
				while(!stack.isEmpty() && stack.peek() != '(') {
					sb.append(stack.pop());
				}
				stack.pop();
			} else if(isOperator(ch)) {
				while(!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
					sb.append(stack.pop());
				}
				stack.push(ch);
			}
		}
		
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		String result = sb.toString();
		System.out.println("Infix: " + infix);
        System.out.println("Postfix: " + sb.toString());
		return result;
	}
	
	private boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }
	
	private int precedence(char ch) {
		switch (ch) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		}
		return -1;
	}

}
