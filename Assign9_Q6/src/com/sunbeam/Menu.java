package com.sunbeam;

import java.util.Scanner;

public class Menu {
	public static EMenu menu(Scanner sc) {
		System.out.println("\n0.EXIT  1.Add Person  2.Display all people  3.Find person by name");
		System.out.print("Please enter your choice :: ");
		return EMenu.values()[sc.nextInt()];
	}
}
