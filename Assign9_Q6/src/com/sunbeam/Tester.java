package com.sunbeam;

import static com.sunbeam.Menu.menu;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		EGender gender;
		EMenu choice;
		Person[] personArray = new Person[10];
		int personIndex = 0;
		Scanner sc = new Scanner(System.in);

		while ((choice = menu(sc)) != EMenu.valueOf("EXIT")) {
			switch (choice) {
			case ADD: {
				if (personIndex < 10) {
					sc.nextLine();
					System.out.print("\nEnter the name : ");
					String name = sc.nextLine();
					System.out.print("Enter the age : ");
					int age = sc.nextInt();
					System.out.println("Select Gender :: ");
					System.out.print("0.Male  1.Female  :: ");
					gender = EGender.values()[sc.nextInt()];
					personArray[personIndex] = new Person(name, age, gender);
					personIndex++;
					break;
				}
			}

			case DISPLAY: {
				System.out.println("-------------------------------------------");
				for (int i = 0; i < personIndex; i++) {
					System.out.println(personArray[i]);
				}
				System.out.println("-------------------------------------------");
				break;
			}

			case FIND: {
				System.out.print("\nEnter the name to search by : ");
				String key = sc.next();
				key = key.toLowerCase();
				int i = 0;
				for (; i < personIndex; i++) {
					if (personArray[i].search(key)) {
						System.out.println("\nPerson found. Following are the details : ");
						System.out.println(personArray[i]);
						break;
					}
				}
				if (i == personIndex) {
					System.out.println("\nPerson not found..");
				}
				break;
			}

			default: {
				System.out.println("Wrong input entered. Please try again..");
				break;
			}
			}
		}

	}

}
