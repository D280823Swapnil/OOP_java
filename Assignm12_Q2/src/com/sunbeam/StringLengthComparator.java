package com.sunbeam;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String> {
	@Override
	public int compare(String arg0, String arg1) {

		return (arg0.length() - arg1.length());
	}
}
