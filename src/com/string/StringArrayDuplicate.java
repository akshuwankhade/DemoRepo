package com.string;

// Find duplicate String from Array

public class StringArrayDuplicate {

	public static void main(String[] args) {
			
		String arr[]= {"Akshay","kalpesh","Chetan","Akshay","Sanju","kalpesh"};
		
		System.out.print("Duplicate Element:-");
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1; j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					
					System.out.print(" "+arr[i]);
				}
			}
		}
	}

}
