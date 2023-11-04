package com.sunbeam;

import java.util.Comparator;

public class BookISBNAscComparator implements Comparator<Book> {

	@Override
	public int compare(Book arg0, Book arg1) {
		return (arg0.getIsbn().compareTo(arg1.getIsbn()));
	}
}
