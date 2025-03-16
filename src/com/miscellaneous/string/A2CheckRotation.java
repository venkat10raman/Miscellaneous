package com.miscellaneous.string;

public class A2CheckRotation {

	public static void main(String[] args) {
		isRotationOfOtherString("java", "vaja");
		isRotationOfOtherString("rama", "amar");
	}

	private static void isRotationOfOtherString(String one, String two) {
		StringBuilder sb = new StringBuilder();
		boolean isNotRotational = false;
		if(one.length() == two.length()) {
			String three = sb.append(one).append(two).toString();
			if(three.contains(two)) {
				System.out.print(one);
				System.out.print(" :: is a rotaional string of :: ");
				System.out.println(two);
			} else {
				isNotRotational = true;
			}
		}
		if(isNotRotational) {
			System.out.print(one);
			System.out.print(" :: is not rotaional string of :: ");
			System.out.println(two);
		}
	}

}
