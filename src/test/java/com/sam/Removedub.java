package com.sam;

import java.util.LinkedHashSet;
import java.util.Set;

public class Removedub {
	public static void main(String[] args) {
		String s ="welcome";
		char[] charArray = s.toCharArray();
	 Set<Character> dup = new LinkedHashSet<>();
	 for(char c:charArray) {
		 dup.add(c);
	 }
	for(Character i:dup) {
		
		System.out.print(i);
	}
	 
	 
		
	
	}

}
