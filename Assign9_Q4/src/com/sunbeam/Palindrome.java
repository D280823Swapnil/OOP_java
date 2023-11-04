package com.sunbeam;

public class Palindrome {
	public static int isPalindrome(String inputString) {
		StringBuilder sb = new StringBuilder(inputString);
		sb.reverse();
		String outputString = sb.toString();

		return inputString.compareTo(outputString);
	}
}
