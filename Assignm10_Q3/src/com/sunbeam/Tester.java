package com.sunbeam;

import static com.sunbeam.Box.printAnyBox;
import static com.sunbeam.Box.printDisplayableBox;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("Enter the name and age of person :: ");
			Person p1 = new Person(sc.nextLine(), sc.nextInt());

			sc.nextLine();
			System.out.print("Enter the name and price of book ::");
			Book b1 = new Book(sc.nextLine(), sc.nextDouble());

			sc.nextLine();
			System.out.print("Enter the name and price of car ::");
			Car c1 = new Car(sc.nextLine(), sc.nextDouble());

			printDisplayableBox(new Box<Person>(p1));
			printDisplayableBox(new Box<Book>(b1));
//			printDisplayableBox(new Box<Car>(c1)); // error because car is not a "Displayable" type

			printAnyBox(new Box<Car>(c1));
		}

	}

}
