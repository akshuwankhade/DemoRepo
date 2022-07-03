package com.string;

import java.util.Scanner;

//	Write a program to print reverse of given String.

public class ReverseString {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String name=sc.next();
		
		//String name="Akshay";
		
		int leng=name.length();
		
		String rev ="";
		
		for(int i=leng-1; i>=0; i--) {
			
			rev=rev+name.charAt(i);		// rev+..... use for concatenation
			//rev=name.charAt(i);
		}
		System.out.print(rev);
		
		/*int b=name.length();
		String s="";
		for(int i=b-1; i>=0; i--) {
			s=s+name.charAt(i);
			
		}
		System.out.println(s);
		}*/
		
		//Approch=2
		String str="Akshay";
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
	}
}

