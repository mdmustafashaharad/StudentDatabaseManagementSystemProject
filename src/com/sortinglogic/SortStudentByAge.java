package com.sortinglogic;

import java.util.Comparator;

import com.jspiders.StudentAttribute;

public class SortStudentByAge implements Comparator<StudentAttribute> {

	@Override
	public int compare(StudentAttribute o1, StudentAttribute o2) {
		return o1.getAge() - o2.getAge();
	}

}
