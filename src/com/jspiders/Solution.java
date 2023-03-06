package com.jspiders;
import java.util.Scanner;
import com.customException.InvalidChoiceException;
import java.util.InputMismatchException;

import com.customException.InvalidChoiceException;

/**
 * 
 * @author Mohammad Mustafa
 * @since 2022
 * 
 * We are calling methods for user
 * while loop is helps to repeated the given proggram untill the condition will false
 * switch condition is helps for users choice
 */

public class Solution {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Up Casting for achieving Abstraction
		Student s = new StudentImpl();
		
//		 Infinite loop -> while (true) && // switch case  // System.exit(0);
		while (true) {
			// Menu Driven Program
			System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
			System.out.println("Welcome to Student Data Base Management System");
			System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
			System.out.println("    1. Add Student Details\r\n"
					+ "    2. Display one Student details \r\n"
					+ "    3. Display All Students Details\r\n"
					+ "    4. Remove one Student Details\r\n"
					+ "    5. Remove All Students Details\r\n"
					+ "    6. Update Student Details\r\n"
					+ "    7. Count All Students\r\n"
					+ "    8. Sort Students\r\n"
					+ "    9. Exit\r\n    please Choose any one choice");
			System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
			int choice = scan.nextInt();
			switch(choice) {
			case 1 : {
				s.addStudent(); break;
			}
			case 2 : {
				s.displayStudent(); break;
			}
			case 3 : {
				s.displayAllStudents(); break;
			}
			case 4 : {
				s.removeStudent(); break;
			}
			case 5 : {
				s.removeAllStudents(); break;
			}
			case 6 : {
				s.updateStudent(); break;
			}
			case 7 : {
				s.countStudents(); break;
			}
			case 8 : {
				s.sortStudents(); break;
			}
			case 9 : {
				System.out.println("Thank you!!!");
				System.exit(0);
			}
			default : {
				try {
					throw new InvalidChoiceException ("Invalid choice, choose currect option");
				} 
				
				catch (InvalidChoiceException e ) {
					try {
						
					} catch(InputMismatchException e1) {
						System.out.println(e1.getMessage());
					}
					System.out.println(e.getMessage());
				} 
			}
			}
		}
		
	}
}
