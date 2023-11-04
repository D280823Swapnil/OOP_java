package com.sunbeam;

public class Tester {
	public static void main(String[] args) {

//		String s1 = "Sunbeam";
//		String s2 = "Sunbeam";
//		System.out.println(s1 == s2); //true
//		System.out.println(s1.equals(s2)); //true

//		String s1 = new String("Sunbeam");
//		String s2 = new String("Sunbeam");
//		System.out.println(s1 == s2); // false
//		System.out.println(s1.equals(s2)); // true

//		String s1 = "Sunbeam";
//		String s2 = new String("Sunbeam");
//		System.out.println(s1 == s2); // false
//		System.out.println(s1.equals(s2)); // true

//		String s1 = "Sunbeam";
//		String s2 = "Sun" + "beam";
//		System.out.println(s1 == s2); // true
//		System.out.println(s1.equals(s2)); // true

//		String s1 = "Sunbeam";
//		String s2 = "Sun";
//		String s3 = s2 + "beam";
//		System.out.println(s1 == s3); // false
//		System.out.println(s1.equals(s3)); // true

//		String s1 = "Sunbeam";
//		String s2 = new String("Sunbeam").intern();
//		System.out.println(s1 == s2); // true
//		System.out.println(s1.equals(s2)); // true

//		String s1 = "Sunbeam";
//		String s2 = "SunBeam";
//		System.out.println(s1 == s2); // false
//		System.out.println(s1.equals(s2)); // false
//		System.out.println(s1.equalsIgnoreCase(s2)); // true
//		System.out.println(s1.compareTo(s2)); // 32
//		System.out.println(s1.compareToIgnoreCase(s2)); // 0

//		StringBuffer s1 = new StringBuffer("Sunbeam");
//		StringBuffer s2 = new StringBuffer("Sunbeam");
//		System.out.println(s1 == s2); // false due to address of obj comparison
//		System.out.println(s1.equals(s2)); // false due to equals method from Object class compares address

//		StringBuffer s1 = new StringBuffer("Sunbeam");
//		String s2 = new String("Sunbeam");
//		// System.out.println(s1 == s2); // Error due to stringBuffer and String cannot
//		// be compared
//		System.out.println(s1.equals(s2)); // false

//		String s1 = new String("Sunbeam");
//		StringBuffer s2 = new StringBuffer("Sunbeam");
//		System.out.println(s1.equals(s2)); // false, due to adress comparison
//		System.out.println(s1.equals(s2.toString())); // actual values of string

//		StringBuffer s1 = new StringBuffer("Sunbeam");
//		StringBuffer s2 = s1.reverse();
//		System.out.println(s1 == s2); // true because reverse returns ref to same object
//		System.out.println(s1.equals(s2)); // reverse done in s1 and assigned to S2

//		StringBuilder s1 = new StringBuilder("Sunbeam");
//		StringBuilder s2 = new StringBuilder("Sunbeam");
//		System.out.println(s1 == s2); // false
//		System.out.println(s1.equals(s2)); // false
//
		StringBuffer s = new StringBuffer();
		System.out.println("Capacity: " + s.capacity() + ", Length: " + s.length()); // 16, 0
		s.append("1234567890");
		System.out.println("Capacity: " + s.capacity() + ", Length: " + s.length()); // 16, 10
		s.append("ABCDEFGHIJKLMNOPQRSTUV");
		System.out.println("Capacity: " + s.capacity() + ", Length: " + s.length()); // 34, 32
	}
}
