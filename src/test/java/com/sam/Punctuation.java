package com.sam;

public class Punctuation {

	public static void main(String[] args) {

		String str = "Welcome";
		int vowelsCount =0; int consonantCount=0;

		for(int i=0; i<str.length(); i++){
		char ch = str.charAt(i);

		if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u'|| ch == 'A'|| ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U'){
		vowelsCount++;
		}else{
		consonantCount++;
		}

		
		}
		System.out.println("Vowels count: " + vowelsCount);
		System.out.println("consonant count: " + consonantCount);


	} }