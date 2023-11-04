package com.sunbeam;

public class Person {
	private String name;
	private int age;
	private EGender gender;

	public Person(String name, int age, EGender gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public EGender getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "name = " + name + ", age = " + age + ", gender = " + gender;
	}

	public boolean search(String key) {
		return this.name.toLowerCase().contains(key);
	}
}
