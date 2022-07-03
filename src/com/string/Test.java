package com.string;

public class Test {

	public static void main(String[] args) {
		
		/* concat method use......
		 
		String name=new String("Java");
		//System.out.println(name);
		String str="Programming";
		name.concat(str);
		System.out.println(name.concat(str));*/
		
		// equals method use...
		
		String str=new String("Java");
		String str1=new String("Java");
		
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		System.out.println("***********");
		
		System.out.println(str==str1); 	// false
		System.out.println(str.equals(str1));	//true
		System.out.println("***********");
		
		String s="Testing";
		String s1="Testing";
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println("***********");
		
		System.out.println(s==s1);	//true
		System.out.println(s.equals(s1));	//true
		
		
	}
}
