package com.sunbeam;

import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		Student[] studentArray = new Student[10];

		studentArray[0] = new Student(5, "Shubham", "Amabajogai", 67.66);
		studentArray[1] = new Student(7, "Nishant", "Latur", 75.45);
		studentArray[2] = new Student(3, "Avinash", "Osmanabad", 57.65);
		studentArray[3] = new Student(10, "Sam", "Jalana", 63.78);
		studentArray[4] = new Student(8, "Rushikesh", "Hingoli", 90.89);
		studentArray[5] = new Student(5, "Kiran", "Latur", 90.89);
		studentArray[6] = new Student(5, "Pradip", "Kada", 75.52);
		studentArray[7] = new Student(5, "Shankar", "Amabajogai", 35.00);
		studentArray[8] = new Student(5, "Lahu", "Parli", 93.55);
		studentArray[9] = new Student(5, "Sagar", "Nilanga", 35.24);

		System.out.println("Before sorting : ");
		for (Student ele : studentArray) {
			System.out.println(ele.toString());
		}

		Arrays.sort(studentArray, new StudentComparator());

		System.out.println("After sorting : ");
		for (Student ele : studentArray) {
			System.out.println(ele.toString());
		}

	}

}
