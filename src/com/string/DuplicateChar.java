package com.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//	Write a program to print duplicate character from given string.

public class DuplicateChar {

	public static void main(String[] args) {
		
		//Aparoch=1
		/*
		//String name="Java Programming";
		String name="Akshay Wankhade";
		
		System.out.println("String length:- "+name.length());
		
		int leng=name.length();
		
		char [] ch=name.toCharArray();
		
		System.out.print("Print Duplicate Char:");
		
		for(int i=0; i<leng; i++) {
			
			for(int j=i+1; j<leng; j++) 
			{
				if(ch[i]==ch[j])
				{
					System.out.print(" "+ch[j]);	
					
				}	
			}
		}
		System.out.println("No duplicate char");*/
			
		//Apparoch=2
			/*String name="Akshay Wankhade";
			int leng=name.length();
			char [] ch=name.toCharArray();
			
			for(int i=0; i<leng; i++){
				for(int j=i+1; j<leng; j++){
					if(ch[i]==ch[j]){
						System.out.println(ch[j]);
					}	
				}
			}*/
			
		//Apparoch=3
		String str="Wankhade";
		int leng=str.length();
		System.out.print("Duplicate char: ");
		
		Set<Character> st=new HashSet<>();
		for(int i=0; i<leng; i++) {
		boolean v=st.add(str.charAt(i));
			if(v==false) {
				System.out.print(str.charAt(i));
			}
		}
	
	//String str="Akshay Waankhade";
	//StringBuilder sb=new StringBuilder(str);
	}
}
