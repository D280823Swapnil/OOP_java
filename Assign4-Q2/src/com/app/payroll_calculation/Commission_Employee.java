package com.app.payroll_calculation;

public class Commission_Employee extends Employee {
	
	double commissionRate;
	int grossSales;

	public Commission_Employee() {
		super();
	}

	public Commission_Employee(String firstName, String lastName, int ssn,double commissionRate,int grossSales) {
		super(firstName, lastName, ssn);
		this.commissionRate = commissionRate;
		this.grossSales = grossSales;
	}
	
	protected String getWeeklySalary() {
		return "\nWeekly Salary : " + this.commissionRate*this.grossSales;
	}
	
	@Override
	public String toString() {
		
		return super.toString()+ "\nGross Sales : "+ this.grossSales +"\nCommission Rate : "+ this.commissionRate+  
				this.getWeeklySalary();
	}

}
