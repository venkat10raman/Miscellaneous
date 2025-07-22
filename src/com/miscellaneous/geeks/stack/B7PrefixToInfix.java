package com.miscellaneous.geeks.stack;

import java.util.Stack;


public class B7PrefixToInfix {

	public static void main(String[] args) {
		B7PrefixToInfix st = new B7PrefixToInfix();
		st.convert("- + A * B C D");
		st.convert("* + P Q - M N");
	}
	
	private void convert(String prefix) {
		Stack<String> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		int end = prefix.length()-1;
		
		for (int i = end; i >= 0 ; i--) {
			char ch = prefix.charAt(i);
			
			if(Character.isLetterOrDigit(ch)) {
				stack.push(String.valueOf(ch));
			} else if(isOperator(ch)) {
				String first = stack.pop();
				String second = stack.pop();
				
				sb = new StringBuilder();
				sb.append("(").append(first).append(ch).append(second).append(")");
				stack.push(sb.toString());
			}
		}
		System.out.println("Prefix :: " + prefix);
		System.out.println("Infix :: " + stack.pop());
		System.out.println("------------");
	}
	
	private boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

}
