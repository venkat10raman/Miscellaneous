package com.miscellaneous.string;

import java.util.HashMap;

public class A3Anagram {

	public static void main(String[] args) {
		anagramStringBuilder("Mother In Law", "Hitler Woman");
		anagramStringBuilder("keEp", "peeK");
		anagramStringBuilder("SiLeNt CAT", "LisTen AcT");
		anagramStringBuilder("Debit Card", "Bad Credit");
		anagramStringBuilder("School MASTER", "The ClassROOM");
		anagramStringBuilder("DORMITORY", "Dirty Room");
		anagramStringBuilder("ASTRONOMERS", "NO MORE STARS");
		anagramStringBuilder("Toss", "Shot");
		anagramStringBuilder("joy", "enjoy");
		
		System.out.println("-----------------");
		
		anagramHashMap("Mother In Law", "Hitler Woman");
		anagramHashMap("keEp", "peeK");
		anagramHashMap("SiLeNt CAT", "LisTen AcT");
		anagramHashMap("Debit Card", "Bad Credit");
		anagramHashMap("School MASTER", "The ClassROOM");
		anagramHashMap("DORMITORY", "Dirty Room");
		anagramHashMap("ASTRONOMERS", "NO MORE STARS");
		anagramHashMap("Toss", "Shot");
		anagramHashMap("joy", "enjoy");
	}

	private static void anagramStringBuilder(String s1, String s2) {
		//Removing white spaces from s1 and s2 and converting case to lower
		String copyS1 = s1.replaceAll("\\s", "").toLowerCase();
		String copyS2 = s2.replaceAll("\\s", "").toLowerCase();

		boolean status = true;

		if(copyS1.length() == copyS2.length()) {

			//Converting copyOfs1 to char array
			char[] s1CharArray = copyS1.toCharArray();

			//Constructing StringBuilder from copyOfs2
			StringBuilder sb = new StringBuilder(copyS2);

			for(char c : s1CharArray) {

				int index = sb.indexOf(""+c);
				if(index == -1) {
					//If not present, setting status as false and breaking the loop
					status = false;
					break;
				} else {
					//If present, removing that character from sb
					sb = sb.deleteCharAt(index);
				}
			}
		} else {
			status = false;
		}

		if(status) {
			System.out.println(s1+" and "+s2+" are anagrams");
		} else {
			System.out.println(s1+" and "+s2+" are not anagrams");
		}
	}
	
	private static void anagramHashMap(String s1, String s2) {
		//Removing white spaces from s1 and s2 and converting case to lower case
		String copyS1 = s1.replaceAll("\\s", "").toLowerCase();
		String copyS2 = s2.replaceAll("\\s", "").toLowerCase();
		
		boolean status = true;
		if(copyS1.length() == copyS2.length()) {
			HashMap<Character, Integer> map = new HashMap<Character, Integer>();
			
			for (int i = 0; i < copyS1.length(); i++) {
				char charAsKey = copyS1.charAt(i);
				int charCountAsValue = 0;
				if(map.containsKey(charAsKey)) {
					charCountAsValue = map.get(charAsKey);
				}
				map.put(charAsKey, ++charCountAsValue);
				
				charAsKey = copyS2.charAt(i);
				charCountAsValue = 0;
				if(map.containsKey(charAsKey)) {
					charCountAsValue = map.get(charAsKey);
				}
				map.put(charAsKey, --charCountAsValue);
			}
			for (int value : map.values()) {
				if(value != 0) {
					status = false;
					break;
				}
			}
		} else {
			status = false;
		}
		
		if(status) {
			System.out.println(s1+" and "+s2+" are anagrams");
		} else {
			System.out.println(s1+" and "+s2+" are not anagrams");
		}
	}

}
