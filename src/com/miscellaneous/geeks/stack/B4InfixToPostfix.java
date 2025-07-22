package com.miscellaneous.geeks.stack;

import java.util.Stack;

public class B4InfixToPostfix {

	public static void main(String[] args) {
		String infix = "A+(B*C-(D/E^F)*G)*H";
		B4InfixToPostfix st = new B4InfixToPostfix();
		st.convert(infix);
	}
	
	private void convert(String infix) {
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < infix.length(); i++) {
			char c = infix.charAt(i);
			
			if(Character.isLetterOrDigit(c)) {
				sb.append(c);
			} else if(c == '(') {
				stack.push(c);
			} else if(c == ')') {
				while(!stack.isEmpty() && stack.peek() != '(') {
					sb.append(stack.pop());
				}
				stack.pop();
			} else if(isOperator(c)){
				while(!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
					sb.append(stack.pop());
				}
				stack.push(c);
			}
		}
		
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		
		System.out.println("Infix: " + infix);
        System.out.println("Postfix: " + sb.toString());
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
