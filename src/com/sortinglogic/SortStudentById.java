package com.sortinglogic;
import java.util.Comparator;
import com.jspiders.StudentAttribute;

/**
 * 
 * @author Mohammad Mustafa
 * @since 2023
 * 
 * Achieved sorting logic by using comparator
 */

public class SortStudentById implements Comparator<StudentAttribute> {

	@Override
	public int compare(StudentAttribute o1, StudentAttribute o2) {
		return o1.getId().compareTo(o2.getId());
	}	
}
