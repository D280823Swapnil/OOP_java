package com.tester;

import java.util.Scanner;

public class Menu {
	public static int mainMenu(Scanner sc) {
		System.out.println("\nWhat do you wish to do?");
		System.out.println("0.EXIT  1.Enter Labor  2.Enter Salesman  3.Enter Clerk  4.Display Employees");
		System.out.println("5.Display Avg Salary of Labors  6.Display Avg Salary of Salesman  7.Display Avg Salary of Clerks");
		System.out.print("Your Choice :: ");
		int choice = sc.nextInt();
		return choice;
	}
}
