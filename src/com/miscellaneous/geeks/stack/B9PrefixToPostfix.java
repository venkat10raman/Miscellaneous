package com.miscellaneous.geeks.stack;

import java.util.Stack;

public class B9PrefixToPostfix {

	public static void main(String[] args) {
		B9PrefixToPostfix st = new B9PrefixToPostfix();
		st.convert("-+A*BCD");
		st.convert("/-AB*+DEF");
	}
	
	private void convert(String prefix) {
		Stack<String> stack = new Stack<>();

        for (int i = prefix.length() - 1; i >= 0; i--) {
            char ch = prefix.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                stack.push(String.valueOf(ch));
            } else if (isOperator(ch)) {
                String first = stack.pop();
                String second = stack.pop();
                String expr = first + second + ch;  
                stack.push(expr);
            }
        }
        
        System.out.println("Prefix :: " + prefix);
        System.out.println("Postfix :: " + stack.pop());
		System.out.println("------------");
	}
	
	private boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

}
