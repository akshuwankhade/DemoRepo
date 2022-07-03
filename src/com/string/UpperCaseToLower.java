package com.string;

//WAP to convert upper case to lower case

public class UpperCaseToLower {

	public static void main(String[] args) {
		
		String str="Welcome To Java Programming";
		int leng=str.length();
		String temp="";
		for(int i=0; i<leng;i++) {
			//temp=temp+Character.toUpperCase(str.charAt(i));
			temp=temp+Character.toLowerCase(str.charAt(i));
		}
		System.out.println(temp);

	}

}
