package com.tester;

import java.util.Scanner;

public class Menu {
	public static EMenu menu(Scanner sc) {
		System.out.println("\nWhat do you wish to do?");
		System.out.println("0.EXIT  1.Add Book  2.Display Books in Asc  3.Delete Book ");
		System.out.println("4.Search by ISBN  5.Delete all Books  6.Display amount of Books");
		System.out.print("Your Choice :: ");
		EMenu choice = EMenu.values()[sc.nextInt()];
		return choice;
	}
}
