package com.sunbeam;

public class Clerk extends Employee {

	public Clerk() {
		super();
	}

	public Clerk(String name, int age, int id, double salary) {
		super(name, age, id, salary);
	}

	@Override
	double calcSalary() {

		return this.salary;
	}

	@Override
	public String toString() {
		return String.format("Clerk [id=%s, salary=%s, name=%s, age=%s]", id, salary, name, age);
	}

}
