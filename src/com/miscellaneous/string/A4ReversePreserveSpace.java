package com.miscellaneous.string;

public class A4ReversePreserveSpace {

	public static void main(String[] args) {
		reverse("I Am Not String");
		reverse("JAVA JSP ANDROID");
		reverse("1 22 333 4444 55555");
	}
	
	private static void reverse(String input) {
		char[] inputArray = input.toCharArray();
		char[] resultArray = new char[inputArray.length];
		
		int left =0, right=inputArray.length-1;
		
		while(left < inputArray.length) {
			if(inputArray[left] == ' ') {
				left++;
			}
			if(inputArray[right] == ' ') {
				right--;
			}
			if(right >= 0) {
				resultArray[left]=inputArray[right];
			}
			left++;
			right--;
		}
		System.out.println(input+" ---> "+String.valueOf(resultArray));
		
	}

}
