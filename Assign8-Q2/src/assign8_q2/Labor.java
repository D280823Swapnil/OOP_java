package assign8_q2;

import java.util.Scanner;

public class Labor extends Employee {
	double rate;
	int hours;

	public Labor() {
		super();
	}

	public Labor(String name, int age, int id, double salary, double rate, int hours) {
		super(name, age, id, salary);
		this.rate = rate;
		this.hours = hours;
	}

	@Override
	double calcSalary() {

		return this.hours * this.rate;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) throws EmployeeException {
		if (rate < 0)
			throw new EmployeeException("Rate cannot be less than zero", rate);

		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) throws EmployeeException {
		if (hours < 0 || hours > 24)
			throw new EmployeeException("Hours cannot be less than 0 or greater than 24", hours);

		this.hours = hours;
	}

	@Override
	public void accept(Scanner sc) throws EmployeeException {
		super.accept(sc);
		System.out.print("Enter Rate : ");
		this.setRate(sc.nextDouble());
		System.out.print("Enter Hours : ");
		this.setHours(sc.nextInt());
	}

	@Override
	public String toString() {
		return "--- Labor ---" + super.toString() + "\nRate Per Hour : " + this.rate + "\nHours : " + this.hours;
	}
}
