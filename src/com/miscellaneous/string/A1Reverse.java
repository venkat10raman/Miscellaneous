package com.miscellaneous.string;

public class A1Reverse {

	public static void main(String[] args) {
		reverseString("venkat");
		countCharacterOccurence("Java is java again java again", "a");
	}
	
	private static void reverseString(String name) {
		System.out.println("Original String is :: "+name);
		System.out.print("Reverse String is :: ");
		System.out.println(new StringBuilder().append(name).reverse().toString());
	}
	
	private static void countCharacterOccurence(String name, String ch) {
		 int count = name.length() - name.replace(ch, "").length();
		 System.out.println(name);
		 System.out.println("Number of occurances of "+ch+" is "+count);
	}
	
}
