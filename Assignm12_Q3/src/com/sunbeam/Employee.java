package com.sunbeam;

import java.util.Objects;
import java.util.Scanner;

public class Employee extends Person implements Comparable<Employee> {
	int id;
	double salary;

	public Employee() {
		super();
	}

	public int getId() {
		return id;
	}

	public Employee(String name, int age, int id, double salary) {
		super(name, age);
		this.id = id;
		this.salary = salary;
	}

	@Override
	public String toString() {

		return new StringBuilder().append(super.toString()).append("\nID : ").append(this.id).append("\nSalary : ")
				.append(this.salary).toString();

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

	@Override
	public int hashCode() {

		return Objects.hash(this.id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Employee)) {
			return false;
		}
		Employee other = (Employee) obj;
		return id == other.id;
	}

	@Override
	public int compareTo(Employee e2) {

		return Integer.compare(this.id, e2.id);
	}

}
