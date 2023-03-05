package com.sortinglogic;

import java.util.Comparator;

import com.jspiders.StudentAttribute;

public class SortStudentByName implements Comparator<StudentAttribute> {

	@Override
	public int compare(StudentAttribute o1, StudentAttribute o2) {
		return o1.getName().compareTo(o2.getName());
	}	 

}
