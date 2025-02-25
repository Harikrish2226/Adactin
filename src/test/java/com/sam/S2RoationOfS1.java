package com.sam;

public class S2RoationOfS1 {

	public static void main(String[] args) {
		String s1 = "abcde",  s2 = "eadbc";

		
		

		if(s1.length() != s2.length()){
		System.out.println("Second string is not a rotation of the string 1");
		}
		else{
		s1 =s1.concat(s1);
		System.out.println(s1);
		if(s1.indexOf(s2)!= -1)
			
		System.out.println("Second string is a rotation of the string 1");
		
		else
		System.out.println("Second string is not a rotation of the string 1");
		

		}

	}
	
}
