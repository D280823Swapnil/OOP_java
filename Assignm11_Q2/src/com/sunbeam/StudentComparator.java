package com.sunbeam;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student arg0, Student arg1) {
		int comparison = arg1.getCity().compareTo(arg0.getCity());
		if (comparison == 0)
			comparison = Double.compare(arg1.getMarks(), arg0.getMarks());
		if (comparison == 0)
			comparison = arg0.getName().compareTo(arg1.getName());
		return comparison;
	}

}
