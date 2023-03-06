package com.jspiders;

/**
 * 
 * @author Mohammad Mustafa
 * @since 2023
 * 
 * using interface functions for generating abstraction for hiding
 * implementation of logics
 * 
 * created multiple some useful abstract methods
 *
 */ 

public interface Student {
	 void addStudent();
	 void displayStudent();
	 void displayAllStudents();
	 void removeStudent();
	 void removeAllStudents();
	 void updateStudent();
	 void countStudents();
	 void sortStudents();
	
}
// All the above methods are automatically public & abstract
// variable -> public static final
