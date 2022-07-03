package com.string;

public class CharString {

	public static void main(String[] args) {
		
		String str="akshay@123";
		char[] ch=str.toCharArray();
		for(char c:ch) {
			if(Character.isAlphabetic(c));
			System.out.println(c);
		}

	}

}
