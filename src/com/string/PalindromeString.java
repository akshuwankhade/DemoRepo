package com.string;

import java.util.Scanner;

//	Write a program to check whether string is palindrome or not.

public class PalindromeString {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a string:- ");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		
		//String name="madam";
		
		int leng=name.length();
		String rev="";
		
		for(int i=leng-1; i>=0; i--) 
		{
			rev=rev+name.charAt(i);
		}
		if(name.equalsIgnoreCase(rev)) 
		{
			System.out.println("Palindrome String");
		}
		else {
			System.out.println("Not a palindrome string");
		}
	}
}
