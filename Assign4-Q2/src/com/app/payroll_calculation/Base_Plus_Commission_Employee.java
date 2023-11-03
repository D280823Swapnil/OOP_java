package com.app.payroll_calculation;

public class Base_Plus_Commission_Employee extends Commission_Employee {

	double baseSalary;

	public Base_Plus_Commission_Employee() {
		super();
	}

	public Base_Plus_Commission_Employee(String firstName, String lastName, int ssn,double commissionRate,int grossSales,double baseSalary) {
		super(firstName, lastName, ssn,commissionRate,grossSales);
		this.baseSalary = baseSalary;
	}
	
	@Override
	protected String getWeeklySalary() {
		return "\nBase Salary : "+ this.baseSalary + "\nWeekly Salary : "+ ((this.commissionRate*this.grossSales) + this.baseSalary);
	}
	
	public double getBaseSalary() {
		return this.baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
