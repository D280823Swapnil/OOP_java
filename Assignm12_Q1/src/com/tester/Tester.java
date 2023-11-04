package com.tester;

import static com.tester.Menu.menu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.sunbeam.Book;
import com.sunbeam.BookPriceDescComparator;

public class Tester {

	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();
		EMenu choice;
		try (Scanner sc = new Scanner(System.in)) {
			while ((choice = menu(sc)) != EMenu.valueOf("EXIT")) {
				switch (choice) {
				// ==============================================================================================
				case ADD: {
					Book temp = new Book();
					System.out.print("Enter the book ISBN :: ");
					temp.setIsbn(sc.next());

					if (bookList.indexOf(temp) == -1) {
						System.out.print("Enter the Author Name :: ");
						temp.setAuthorName(sc.next());
						System.out.print("Enter the Book Price :: ");
						temp.setPrice(sc.nextDouble());
						System.out.print("Enter the Book Quantity :: ");
						temp.setQuantity(sc.nextInt());
						bookList.add(temp);
						break;
					}

					System.out.print("\nBook already exists.. Please enter the book quantity to be added :: ");
					int bookQuantity = sc.nextInt();

					bookList.get(bookList.indexOf(temp))
							.setQuantity(bookList.get(bookList.indexOf(temp)).getQuantity() + bookQuantity);
					break;
				}
				// ==============================================================================================
				case DISPLAY: {
					System.out.println();
					for (int i = 0; i < bookList.size(); i++) {
						System.out.println(bookList.get(i).toString());
					}
					break;
				}
				// ==============================================================================================
				case SEARCH_BY_ISBN: {
					System.out.print("Enter the ISBN to search:: ");
					Book keyBook = new Book();
					keyBook.setIsbn(sc.next());
					if (bookList.contains(keyBook))
						System.out.println("Book exists in the library.");
					else
						System.out.println("Book not found in the library.");
					break;
				}
				// ==============================================================================================
				case DELETE_BY_INDEX: {

					while (true) {
						try {
							System.out.println("Enter the index of the book to be removed :: ");
							System.out.println("List :");
							for (int i = 0; i < bookList.size(); i++) {
								System.out.println(i + " : ISBN " + bookList.get(i).getIsbn());
							}
							System.out.print("INDEX :: ");
							bookList.remove(sc.nextInt());
						} catch (IndexOutOfBoundsException e) {
							System.out.println("Please enter a valid index..");
							continue;
						}
						break;
					}
					break;
				}
				// ==============================================================================================
				case DELETE_BY_ISBN: {
					System.out.print("Enter the ISBN to delete :: ");
					Book keyBook = new Book();
					keyBook.setIsbn(sc.next());

					if (bookList.contains(keyBook)) {
						bookList.remove(keyBook);
						System.out.println("Book removed...");
					} else {
						System.out.println("No such book exists. Please retry...");
					}

					break;
				}
				// ==============================================================================================
				case DELETE_BY_NAME: {

					System.out.print("Enter the author name to delete :: ");
					String name = sc.next();

					for (Book ele : bookList) {
						if (ele.getAuthorName().equals(name)) {
							bookList.remove(bookList.indexOf(ele));
							System.out.println("Book removed..");
						}
					}
					break;
				}
				// ==============================================================================================
				case SORT_ASC: {

					Collections.sort(bookList);
					System.out.println("Ascending Sorted List by ISBN :");
					for (Book ele : bookList) {
						System.out.println(ele);
					}
					break;
				}
				// ==============================================================================================
				case SORT_DESC: {

					Collections.sort(bookList, new BookPriceDescComparator());
					System.out.println("Descending Sorted List by Price :");
					for (Book ele : bookList) {
						System.out.println(ele);
					}
					break;
				}
				// ==============================================================================================
				case REVERSE_LIST: {

					Collections.reverse(bookList);
					System.out.println("Reversed list :");
					for (Book ele : bookList) {
						System.out.println(ele);
					}
					break;
				}
				// ==============================================================================================
				default: {
					System.out.println("Wrong input. Please try again...");
					break;
				}
				}
			}
		}
	}
}
