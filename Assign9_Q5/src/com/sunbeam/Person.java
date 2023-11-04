package com.sunbeam;

import java.util.Objects;
import java.util.Scanner;

public class Person {
	String name;
	int age;
	
	public Person() {
		
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age)throws EmployeeException  {
		if(age<0 || age>120) {
			throw new EmployeeException("Age Shouldn't be less than zero or greater than 120",age);
		}
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.name,this.age);
	}
		
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj==null) {
			return false;
		}
		if(!(obj instanceof Person)) {
			return false;
		}
		Person e = (Person) obj;
		
		return this.name==e.name && this.age==e.age;
	}
	
	@Override
	public String toString() {
		return "\nName : "+this.name+ "\nAge : "+ this.age;
	}
	
	public void accept(Scanner sc) throws EmployeeException {
		System.out.print("Enter Name : ");
		this.setName(sc.next());
		System.out.print("Enter Age : ");
		this.setAge(sc.nextInt());
	}
}
