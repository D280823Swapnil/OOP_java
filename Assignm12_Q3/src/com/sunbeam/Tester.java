package com.sunbeam;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Tester {

	public static int options(Scanner sc) {
		System.out.println("-------------------------------");
		System.out.println("0 Exit");
		System.out.println("1 Add employee");
		System.out.println("2 Delete employee");
		System.out.println("3 Search employee");
		System.out.println("4 Sort employees");
		System.out.println("5 Edit employee	");
		System.out.println("6 Display employees");

		System.out.println("-------------------------------");
		System.out.print("Enter Choice ");
		int ch = sc.nextInt();
		System.out.println("-------------------------------");
		return ch;
	}

	public static void main(String[] args) {

		List<Employee> employees = new LinkedList<>();

		Scanner sc = new Scanner(System.in);

		int choice = 1;
		while (choice != 0) {
			choice = Tester.options(sc);

			switch (choice) {
			case 0:
				break;

			case 1: {
				Employee e = new Employee();

				try {
					e.accept(sc);
					employees.add(e);
				} catch (EmployeeException exp) {
					exp.displayError();
				}

			}
				break;

			case 2: {
				System.out.print("Enter employee id ");
				int id = sc.nextInt();

				Employee e = new Employee();
				try {
					e.setId(id);
					int index = -1;
					index = employees.indexOf(e);

					if (index == -1) {
						System.out.println("Employee not found.....");
					} else {
						employees.remove(index);
						System.out.println("Employee removed...");
					}

				} catch (EmployeeException e1) {
					e1.displayError();
				}

			}
				break;
			case 3: {
				System.out.print("Enter employee id ");
				int id = sc.nextInt();
				Employee e = new Employee();
				try {
					e.setId(id);

					int index = employees.indexOf(e);

					if (index == -1) {
						System.out.println("Employee not found.....");
					} else {
						System.out.println("Employee Found");
					}

				} catch (EmployeeException e1) {

					e1.displayError();
				}

			}
				break;
			case 4: {
				// Sort employees
				Collections.sort(employees);
			}

				break;
			case 5:
				// Edit employee
				System.out.print("Enter employee id");
				Employee e = new Employee();
				try {
					e.setId(sc.nextInt());
					int index = employees.indexOf(e);
					if (index == -1) {
						System.out.println("Employee not found.....");
					} else {
						System.out.println("---- Old employee details ---- \n" + employees.get(index));
						e = new Employee();
						System.out.println("--- Enter New Employee Details ---");
						e.accept(sc);
						employees.set(index, e);
					}

				} catch (EmployeeException e1) {

					e1.displayError();
					;
				}
				break;
			case 6: {
				for (Iterator<Employee> i = employees.iterator(); i.hasNext();) {
					System.out.println(i.next());
				}
			}

				break;
			default:
				System.out.println("Wrong Input Entered........");
				break;
			}
		}
	}

}
