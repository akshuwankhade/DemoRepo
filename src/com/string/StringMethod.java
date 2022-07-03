package com.string;

public class StringMethod {
	
	public static void main(String[] args) {
		
		String s="Java By IRise Programming";
		String s1="Testing Java";
		
		System.out.println(s1.substring(2, 9));	// return string index start and index end
		System.out.println(s1.charAt(2));		// char print index position
		System.out.println(s1.length()); 		// String count of length
		System.out.println(s1.substring(4)); 	// return string begin index start
		System.out.println(s1.contains(s));		// return boolean type result string compare data.
		System.out.println(s1.join("-", "Java","is","cool"));
		System.out.println(s.equals(s1));       // Object compare boolean result
		System.out.println(s1.isEmpty());       // It checks if string is empty
		System.out.println(s.concat(s1));
		System.out.println(s1.equalsIgnoreCase(s));
		System.out.println(s.intern());
	}
}
