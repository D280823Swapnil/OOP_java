package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tester {

	public static void main(String[] args) {
		List<String> stringArray = new ArrayList<>();
		stringArray.add("This is a test.");
		stringArray.add("This is my test.");
		stringArray.add("This is my favorite test phrase to check.");
		stringArray.add("This is indeed a test.");
		stringArray.add("This is very very long test phrase.");

		System.out.println("List is :: ");
		for (String ele : stringArray) {
			System.out.println(ele);
		}

		System.out.println("\nThe max string is :: ");
		System.out.println(Collections.max(stringArray, new StringLengthComparator()));
	}

}
