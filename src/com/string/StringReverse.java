package com.string;

public class StringReverse {

	public static void main(String[] args) {
		
		String str="Akshay";
		int leng=str.length();
		String rev="";
		
		for(int i=leng-1; i>=0; i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("Reverse String: "+rev);
	
	String st="Wankhade";
	StringBuffer sb=new StringBuffer(st);
	System.out.println(sb.reverse());
	}

}
