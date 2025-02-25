package com.sam;

import java.util.Scanner;

public class countOfTheChar {

	public static String s = null;

	public static void count() {

		// String s = "Java Selenium";
		int count = 0;

		for (int i = 0; i < s.length() - 1; i++) {

			//char c = s.charAt(i);

			if (s.charAt(i) != ' ')

				count++;

		}
		System.out.println("Count of the String: " + count);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String");

		s = sc.nextLine();

		System.out.println("Given String is: " + s);

		count();

	}

}
