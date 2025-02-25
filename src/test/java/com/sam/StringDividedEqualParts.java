package com.sam;

public class StringDividedEqualParts {

	public static void stringDivide(){

			String ss = "aaaaabbbbbcccccddddd";
	
			int len = ss.length();
	
			int n = 6;
	
			int temp =0; int chars = len/n;
	
			String[] strarray = new String[n];
	
	
	
			if(len % n !=0){
			System.out.println("String cannot be divided in to " + n + " equal parts");
			}
			else{
			for (int i =0; i<ss.length(); i= i+chars){
	
				strarray[temp] = ss.substring(i, i+chars);
			 
			temp++;
			}
			
			System.out.println(n + " Equal parts of the strings are ");
	
			for(int i=0; i<strarray.length; i++){
			System.out.println(strarray[i]);
			}
	
	
			}
			}
	
			
	
	public static void main(String[] args) {
		stringDivide();
	}
}
