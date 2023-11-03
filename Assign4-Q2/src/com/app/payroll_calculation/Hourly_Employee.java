package com.app.payroll_calculation;

public class Hourly_Employee extends Employee {
	double hourlyWage;
	double hoursWorked;
	double weeklySalary;

	public Hourly_Employee() {
		super();
	}

	public Hourly_Employee(String firstName, String lastName, int ssn, double hourlyWage, double hoursWorked ) {
		super(firstName, lastName, ssn);
		this.hourlyWage = hourlyWage;
		this.hoursWorked  = hoursWorked;
	}
	
	private double getWeeklySalary() {
		if(this.hoursWorked>40) {
			double extraHoursWorked = this.hoursWorked - 40;
			this.weeklySalary = extraHoursWorked*this.hourlyWage*1.5 + this.hourlyWage*40;
		}
		else {
			this.weeklySalary = this.hoursWorked*this.hourlyWage;
		}
		
		return this.weeklySalary;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + "\nHourly Wage : "+ this.hourlyWage + "\nHours Worked : "+ this.hoursWorked + "\nWeekly Salary : "+ this.getWeeklySalary();
	}

}
