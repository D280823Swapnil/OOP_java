package com.sunbeam;

public class StringCompute {

	public static boolean isEndVowel(String inputString) {
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

		for (char vowel : vowels) {
			if (Character.toLowerCase(inputString.charAt(inputString.length() - 1)) != vowel) {
				continue;
			} else {
				return true;
			}
		}
		return false;

	}
}
