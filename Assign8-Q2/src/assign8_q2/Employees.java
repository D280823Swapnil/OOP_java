package assign8_q2;

import java.util.Scanner;

public final class Employees {

	public static boolean acceptLabor(Labor l, Scanner sc) {
		try {
			l.accept(sc);
		} catch (EmployeeException e) {
			e.displayError();
			return false;
		}

		return true;
	}

	public static boolean acceptClerk(Clerk c, Scanner sc) {
		try {
			c.accept(sc);
		} catch (EmployeeException e) {
			e.displayError();
			return false;
		}

		return true;
	}

	public static boolean acceptSalesman(Salesman s, Scanner sc) {
		try {
			s.accept(sc);
		} catch (EmployeeException e) {
			e.displayError();
			return false;
		}

		return true;
	}

	public static double averageSalLabors(Employee[] arr, int index) {

		int count = 0;
		double sal = 0.0;
		for (int i = 0; i < index; i++) {
			if (arr[i] instanceof Labor) {
				count++;
				sal += arr[i].calcSalary();
			}
		}

		return sal / count * 1.00;
	}

	public static double averageSalSalesmans(Employee[] arr, int index) {

		int count = 0;
		double sal = 0.0;
		for (int i = 0; i < index; i++) {
			if (arr[i] instanceof Salesman) {
				count++;
				sal += arr[i].calcSalary();
			}
		}

		return sal / count * 1.00;
	}

	public static double averageSalClerks(Employee[] arr, int index) {

		int count = 0;
		double sal = 0.0;
		for (int i = 0; i < index; i++) {
			if (arr[i] instanceof Clerk) {
				count++;
				sal += arr[i].calcSalary();
			}
		}

		return sal / count * 1.00;
	}
}
