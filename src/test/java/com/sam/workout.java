package com.sam;

import java.util.Arrays;

public class workout {

	public static void main(String[] args) {
		String str = "aaaabbbbcccc";

		int len = str.length();

		int n= 3;

		int temp =0;

		int chars= len/n;

		String[] sarray = new String[n];

		if(len % 3 !=0) {
			System.out.println("The given string cannot divided in to two equal parts");
		}else {
		
		for(int i=0; i<len; i=i+chars){
		sarray[temp] = str.substring(i, i+chars);
		temp++;
		}

		System.out.println(n + "equal parts of the given string is: ");
		for(int i=0; i<sarray.length; i++){
		System.out.println(sarray[i]);
		}	}}
}