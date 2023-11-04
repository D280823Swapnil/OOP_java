package com.sunbeam;

import static com.sunbeam.StringCompute.isEndVowel;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		String[] inputArray = new String[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print("Enter the string to check : ");
			inputArray[i] = sc.nextLine();
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("===================================================");
			System.out.println("String : " + inputArray[i]);
			if (isEndVowel(inputArray[i]) == true)
				System.out.println("String is ending in vowel.\n");
			else
				System.out.println("String is not ending in vowel.\n");
		}

		sc.close();
	}

}
