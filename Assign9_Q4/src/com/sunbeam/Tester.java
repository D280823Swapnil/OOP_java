package com.sunbeam;

import static com.sunbeam.Palindrome.isPalindrome;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string to test for palindrome : ");
		String inputString = sc.nextLine();

		if (isPalindrome(inputString) == 0)
			System.out.println("The string is a Palindrome..");
		else
			System.out.println("The string is not a Palindrome..");

		sc.close();
	}

}
