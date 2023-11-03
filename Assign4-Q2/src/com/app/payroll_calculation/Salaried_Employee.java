package com.app.payroll_calculation;

public class Salaried_Employee extends Employee{
	double weeklySalary;
	
	public Salaried_Employee(){
		super();
	}
	
	
	public Salaried_Employee(String firstName, String lastName, int ssn,double weeklySalary) {
		super(firstName, lastName,ssn);
		this.weeklySalary = weeklySalary;
	}


	@Override
	public String toString() {
		return super.toString() +"\nWeekly Salary : " + this.weeklySalary;
	}
}
