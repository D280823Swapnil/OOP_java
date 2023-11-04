package com.tester;

import static com.tester.Menu.menu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.sunbeam.Book;
import com.sunbeam.BookISBNAscComparator;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Book> bookArray = new ArrayList<>();
		EMenu choice;

		while ((choice = menu(sc)) != EMenu.valueOf("EXIT")) {
			switch (choice) {
			case ADD: {
				Book temp = new Book();
				System.out.print("Enter the book ISBN :: ");
				temp.setIsbn(sc.next());
				System.out.print("Enter the Author Name :: ");
				temp.setAuthorName(sc.next());
				System.out.print("Enter the Book Price :: ");
				temp.setPrice(sc.nextDouble());
				System.out.print("Enter the Book Quantity :: ");
				temp.setQuantity(sc.nextInt());
				bookArray.add(temp);
				System.out.println("Book added...");
				break;
			}
			case DISPLAY: {
				System.out.println();
				bookArray.sort(new BookISBNAscComparator());

				Iterator<Book> bookIterator = bookArray.iterator();

				while (bookIterator.hasNext()) {
					Book element = bookIterator.next();
					System.out.println(element.toString());
				}
				break;
			}
			case DELETE_SPECIFIC: {
				System.out.print("Enter the ISBN to delete :: ");
				Book keyBook = new Book();
				keyBook.setIsbn(sc.next());

				bookArray.remove(keyBook);
				System.out.println("Book removed...");

				break;
			}
			case SEARCH: {
				System.out.print("Enter the ISBN to search:: ");
				Book keyBook = new Book();
				keyBook.setIsbn(sc.next());
				if (bookArray.contains(keyBook))
					System.out.println("Book exists in the library.");
				else
					System.out.println("Book not found in the library.");
				break;
			}
			case DELETE_ALL: {
				bookArray.clear();
				System.out.println("All book entries removed...");
				break;
			}
			case DISPLAY_AMOUNT: {
				System.out.println("\nTotal books in the library are = " + bookArray.size());
				break;
			}
			default:
				break;
			}
		}
	}

}
