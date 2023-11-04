package com.sunbeam;

import java.util.Scanner;

public abstract class Employee extends Person {
	int id;
	double salary;

	public Employee() {

	}

	public Employee(String name, int age, int id, double salary) {
		super(name, age);
		this.id = id;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return String.format("Employee [id=%s, salary=%s]", id, salary);
	}

	public void setId(int id) throws EmployeeException {
		if (id < 0)
			throw new EmployeeException("Id cannot be negative", id);
		this.id = id;
	}

	public void setSalary(double salary) throws EmployeeException {
		if (salary < 0)
			throw new EmployeeException("Salary cannot be negative", salary);
		this.salary = salary;
	}

	@Override
	public void accept(Scanner sc) throws EmployeeException {
		super.accept(sc);
		System.out.print("Enter Id : ");
		this.setId(sc.nextInt());
		System.out.print("Enter Salary : ");
		this.setSalary(sc.nextDouble());
	}

	abstract double calcSalary();

}
