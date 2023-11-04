package com.sunbeam;

import static com.sunbeam.Sorter.selectionSort;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Double[] doubleArray = new Double[5];
			System.out.println("Enter 5 decimal point numbers :: ");

			for (int i = 0; i < 5; i++) {
				doubleArray[i] = sc.nextDouble();
			}

			System.out.print("Before sorting, the list is: ");
			for (Double element : doubleArray) {
				System.out.print(element + " ");
			}

			selectionSort(doubleArray, new DoubleCompareAscend());

			System.out.print("\nAfter sorting, the list is: ");
			for (Double element : doubleArray) {
				System.out.print(element + " ");
			}

		}

	}

}
