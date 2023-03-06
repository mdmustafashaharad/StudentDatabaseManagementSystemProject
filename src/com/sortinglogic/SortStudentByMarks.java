package com.sortinglogic;

/**
 * 
 * @author Mohammad Mustafa
 * @since 2023
 * 
 * Achieved sorting logic by using comparator
 */

import java.util.Comparator;
import com.jspiders.StudentAttribute;

public class SortStudentByMarks implements Comparator<StudentAttribute> {

	@Override
	public int compare(StudentAttribute o1, StudentAttribute o2) {
		Double a = o1.getMarks();
		Double b = o2.getMarks();
		return a.compareTo(b);
	}	 
	
}
