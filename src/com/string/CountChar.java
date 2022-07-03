package com.string;

public class CountChar {
	
	// WAP to find the character count of each string

	public static void main(String[] args) {

		String character="Java plus automation programming";
		
		int count=character.length();
		
		System.out.println("Total Count character: "+count);
		
		int count_afterRemove=character.replace("a", "").length();
		
		System.out.println("Total Count character after remove: "+count_afterRemove);
		
		int total_count=count-count_afterRemove;
		
		System.out.println("Total count character: "+total_count);
		
	}

}
