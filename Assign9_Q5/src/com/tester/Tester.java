package com.tester;

import static com.tester.Menu.mainMenu;

import java.util.Scanner;

import com.sunbeam.Clerk;
import com.sunbeam.Employee;
import com.sunbeam.Employees;
import com.sunbeam.Labor;
import com.sunbeam.Salesman;

public class Tester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee[] employees = new Employee[5];
		int index = 0;
		int choice;

		while ((choice = mainMenu(sc)) != 0) {
			switch (choice) {
			case 1: { // Accept Labor
				if (index < 5) {
					Labor l = new Labor();
					if (Employees.acceptLabor(l, sc)) {
						employees[index] = l;
						index++;
					}
				} else
					System.out.println("Employee List Full.....");
				break;
			}

			case 2: { // Accept Salesman
				if (index < 5) {
					Salesman s = new Salesman();
					if (Employees.acceptSalesman(s, sc)) {
						employees[index] = s;
						index++;
					}
				} else
					System.out.println("Employee List Full.....");
				break;
			}

			case 3: { // Accept Clerk
				if (index < 5) {
					Clerk c = new Clerk();
					if (Employees.acceptClerk(c, sc)) {
						employees[index] = c;
						index++;
					}
				} else
					System.out.println("Employee List Full.....");
				break;
			}

			case 4: { // Display Employees
				System.out.println("====================================================");
				for (int i = 0; i < index; i++) {
					System.out.println(employees[i].toString());
					System.out.println("====================================================");
				}
				break;
			}

			case 5: {
				System.out.println("====================================================");
				System.out.println("Average Salary of Labours = " + Employees.averageSalLabors(employees, index));
				System.out.println("====================================================");
				break;
			}

			case 6: {
				System.out.println("====================================================");
				System.out.println("Average Salary of Salesman = " + Employees.averageSalSalesmans(employees, index));
				System.out.println("====================================================");
				break;
			}

			case 7: {
				System.out.println("====================================================");
				System.out.println("Average Salary of Clerks = " + Employees.averageSalClerks(employees, index));
				System.out.println("====================================================");
				break;
			}

			default: {
				System.out.println("Wrong Input Entered...");
				break;
			}
			}
		}
		sc.close();
	}
}
