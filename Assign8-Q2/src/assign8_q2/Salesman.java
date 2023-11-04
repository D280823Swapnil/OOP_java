package assign8_q2;

import java.util.Scanner;

public class Salesman extends Employee {
	int target;
	double commission;

	public Salesman() {
		super();
	}

	public Salesman(String name, int age, int id, double salary, int target, double commission) {
		super(name, age, id, salary);
		this.target = target;
		this.commission = commission;
	}

	@Override
	double calcSalary() {
		return this.salary + this.commission;
	}

	public void setTarget(int target) throws EmployeeException {
		if (target < 0)
			throw new EmployeeException("Target cannot be nagative", target);
		this.target = target;
	}

	public void setCommission(double commission) throws EmployeeException {
		if (commission < 0) {
			throw new EmployeeException("Commission cannot be negative", commission);
		}
		this.commission = commission;
	}

	@Override
	public void accept(Scanner sc) throws EmployeeException {
		super.accept(sc);
		System.out.print("Enter Target : ");
		this.setTarget(sc.nextInt());
		System.out.print("Enter Commission : ");
		this.setCommission(sc.nextDouble());
	}

	@Override
	public String toString() {
		return "--- Salesman ---" + super.toString() + "\nTarget : " + this.target + "\nCommission : "
				+ this.commission;
	}
}
