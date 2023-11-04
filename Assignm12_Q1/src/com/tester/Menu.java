package com.tester;

import java.util.Scanner;

public class Menu {
	public static EMenu menu(Scanner sc) {
		int input;
		EMenu choice = EMenu.EXIT;

		while (true) {
			System.out.println("\nWhat do you wish to do?");
			System.out.println("0.EXIT  1.Add Book  2.Display Books  3.Search by ISBN  4.Delete book by Index ");
			System.out.println("5.Delete book by ISBN  6.Delete book by Name  7.Sort the list in Ascending order");
			System.out.println("8.Sort the list in Descending order  9.Reverse the list order");
			System.out.println("=========================================");
			System.out.print("Your Choice :: ");
			input = sc.nextInt();
			if (input >= 0 && input < 10) {
				choice = EMenu.values()[input];
				System.out.println("=========================================");
				break;
			}
			choice = EMenu.values()[10];
		}

		return choice;
	}
}