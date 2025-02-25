package com.sam;

public class SubsetOfString {

	public static void subSetOfString() {
		
		String ss = "Mornin";
		int len = ss.length();

		int temp = 0;

		String[] arr = new String[len * (len + 1) / 2];

		for (int i = 0; i < len; i++) {

			for (int j = i; j < len; j++) {
				String part = ss.substring(i, j + 1);
				arr[temp] = part;
				temp++;

			}

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
	public static void main(String[] args) {
  subSetOfString();
		
	}
}
