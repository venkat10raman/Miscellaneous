package com.miscellaneous.geeks.stack;

import java.util.Stack;

public class B8PostfixToPrefix {

	public static void main(String[] args) {
		B8PostfixToPrefix st = new B8PostfixToPrefix();
		st.convert("AB-DE+F*/");
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
				sb.append(ch).append(second).append(first);
				stack.push(sb.toString());
			}
		}
		
		System.out.println("Postfix :: " + postfix);
		System.out.println("Prefix :: " + stack.pop());
		System.out.println("------------");
	}
	
	private boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

}
