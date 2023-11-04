package com.sunbeam;

import java.util.Comparator;

public class BookPriceDescComparator implements Comparator<Book> {

	@Override
	public int compare(Book arg0, Book arg1) {
		return (int) (-(arg0.getPrice() - arg1.getPrice()));
	}
}
