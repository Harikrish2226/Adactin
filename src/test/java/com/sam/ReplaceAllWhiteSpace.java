package com.sam;

public class ReplaceAllWhiteSpace {

	public static void replaceWhiteSpace() {
		String s = "Remove all white spaces";
		String[] arr = s.split(" ");
		String s1="";
		for(int i=0;i<arr.length;i++) {
			s1=s1+arr[i];
		}
		System.out.println(s1);

	}

	public static void replaceAllSpace() {
		
	String	s = "Remove all white spaces";

	String	ss = s.replaceAll("\\s+", "");

		System.out.println(ss);
		
	}

	public static void main(String[] args) {
		 replaceWhiteSpace();
//		replaceAllSpace();

	}

}