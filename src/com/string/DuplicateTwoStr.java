package com.string;

//	Write a program to print duplicate String from two String array.

public class DuplicateTwoStr {
	
	public static void main(String[] args) {
		
		String s="Akshay";
		String s1="Wankhade";
		
		int leng=s.length();
		int leng1=s1.length();
		
		char []ch=s.toCharArray();
		char []ch1=s1.toCharArray();
		
		System.out.print("Remove charactore: ");
		
		for(int i=0; i<leng; i++) {
			
			for(int j=0; j<leng1; j++) {
				
				if(ch[i]==ch1[j])
				{
				System.out.print(" "+ch[i]);
				}
			}
		}
	}

}
