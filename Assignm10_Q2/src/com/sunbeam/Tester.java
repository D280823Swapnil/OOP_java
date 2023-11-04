package com.sunbeam;

import static com.sunbeam.MinCalculator.getMin;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Integer[] intArray = new Integer[5];
			Double[] doubleArray = new Double[5];

			System.out.print("Enter a list of 5 integer numbers :: ");
			for (int i = 0; i < 5; i++) {
				intArray[i] = sc.nextInt();
			}
			System.out.print("Enter a list of 5 decimal point numbers :: ");
			for (int i = 0; i < 5; i++) {
				doubleArray[i] = sc.nextDouble();
			}

			Integer minInteger = getMin(intArray);
			Double minDouble = getMin(doubleArray);

			System.out.println("Minimum of integer array is = " + minInteger);
			System.out.println("Minimum of double array is = " + minDouble);
		}
	}
}
