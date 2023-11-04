package assign8_q2;

import java.util.Scanner;

public class Tester {
	public static int options(Scanner sc) {
		System.out.println("-------------------------------");
		System.out.println("0 Exit");
		System.out.println("1 Enter Labor");
		System.out.println("2 Enter Salesman");
		System.out.println("3 Enter Clerk");
		System.out.println("4 Display Employees");
		System.out.println("5 Display Avg Salary of Labors");
		System.out.println("6 Display Avg Salary of Salesman");
		System.out.println("7 Display Avg Salary of Clerks");
		System.out.println("-------------------------------");
		System.out.print("Enter Choice ");
		int ch = sc.nextInt();
		System.out.println("-------------------------------");
		return ch;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Employee[] employees = new Employee[5];
		int index = 0, choice = 1;

		while (choice != 0) {
			choice = Tester.options(sc);
			switch (choice) {
			case 0:
				break;
			case 1: {
				if (index == 5) {
					System.out.println("Employee List Full.....");
					break;
				}
				Labor l = new Labor();
				if (Employees.acceptLabor(l, sc)) {
					employees[index] = l;
					index++;
				}
			}
				break;
			case 2: {
				if (index == 5) {
					System.out.println("Employee List Full.....");
					break;
				}
				Salesman s = new Salesman();
				if (Employees.acceptSalesman(s, sc)) {
					employees[index] = s;
					index++;
				}
			}
				break;
			case 3: {
				if (index == 5) {
					System.out.println("Employee List Full.....");
					break;
				}
				Clerk c = new Clerk();
				if (Employees.acceptClerk(c, sc)) {
					employees[index] = c;
					index++;
				}
			}
				break;
			case 4:
				System.out.println("-------------------------------");
				for (int i = 0; i < index; i++) {
					System.out.println(employees[i].toString());
					System.out.println("-------------------------------");
				}

				break;
			case 5:
				System.out.println("-------------------------------");
				System.out.println("Average Salary of Labours = " + Employees.averageSalLabors(employees, index));
				System.out.println("-------------------------------");
				break;
			case 6:
				System.out.println("-------------------------------");
				System.out.println("Average Salary of Salesman = " + Employees.averageSalSalesmans(employees, index));
				System.out.println("-------------------------------");
				break;
			case 7:
				System.out.println("-------------------------------");
				System.out.println("Average Salary of Clerks = " + Employees.averageSalClerks(employees, index));
				System.out.println("-------------------------------");
				break;
			default:
				System.out.println("Wrong Input Entered...");
				break;

			}
		}

		sc.close();
	}

}
