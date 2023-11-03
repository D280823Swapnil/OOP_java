package com.app.payroll_calculation;

public abstract class Employee {
	String firstName;
	String lastName;
	int ssn;
	
	public Employee(){
		
	}
	
	public Employee(String firstName, String lastName, int ssn) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
	}
	
	@Override
	public String toString() {
		
		return this.getClass().getSimpleName() +" : "+ this.firstName + " " + this.lastName + "\nSocial Security No : " + this.ssn;
	}

}
