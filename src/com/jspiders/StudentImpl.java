package com.jspiders;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.customException.InvalidChoiceException;
import com.customException.StudentNotFoundException;
import com.sortinglogic.SortStudentByAge;
import com.sortinglogic.SortStudentById;
import com.sortinglogic.SortStudentByMarks;
import com.sortinglogic.SortStudentByName;

/**
 * 
 * @author Mohammad Mustafa
 * @since 2022
 * 
 * We are adding implementation for a abstract methods StudentImpl 
 *
 */

public class StudentImpl implements Student {
	Scanner scan = new Scanner(System.in);
	Map<String,StudentAttribute> m = new LinkedHashMap<String,StudentAttribute>();
	
	/**
	 * Coverting Map into Set
	 * Keys are Student Id and Datatype is String
	 */
	Set<String> keys = m.keySet();
	
	@Override
	public void addStudent() {
		System.out.println("Enter The Student name");
		String name = scan.next();
		System.out.println("Enter The Student Age");
		int age = scan.nextInt();
		System.out.println("Enter The Student Marks");
		double marks = scan.nextDouble();
		StudentAttribute sa = new StudentAttribute(name,age,marks);
		m.put(sa.getId(), sa);
		System.out.println("Student Record inserted Successfully");
		System.out.println("Your student id is "+sa.getId());
	}

	@Override
	public void displayStudent() {
		
		if (m.isEmpty()) {
			try {
				throw new StudentNotFoundException("Student Record Not Available To Display");
			} catch ( StudentNotFoundException e) {
				System.out.println(e.getMessage());
			}
		} else {
			System.out.println("Enter Student id ");
			String id = scan.next();
			id = id.toUpperCase();
			
			if (m.containsKey(id)) {
				StudentAttribute temp = m.get(id);
				System.out.println("ID : "+temp.getId());
				System.out.println("NAME : "+temp.getName());
				System.out.println("AGE : "+temp.getAge());
				System.out.println("MARKS : "+temp.getMarks());
				
			} else {
				System.out.println("Your Entered Id Is MisMatch");
			}
		}
	}

	@Override
	public void displayAllStudents() {
		if(m.isEmpty()) {
			try {
				throw new StudentNotFoundException("Student Record Not Available To Display");
			} catch ( StudentNotFoundException e) {
				System.out.println(e.getMessage());
			}
		} else {
			System.out.println("Student Records As Follows :");
			System.out.println("--------------------------");
			for (String s : keys) {
				System.out.println(m.get(s));
			}
		}
	}

	@Override
	public void removeStudent() {
		if (m.size()!=0) {
			System.out.println("Enter ID of student");
			String id = scan.next();
			id = id.toUpperCase();
			
			if (m.containsKey(id)) {
				System.out.println(m.get(id));
			} else {
				try {
					throw new StudentNotFoundException("Student Record Not Found");
				} catch (StudentNotFoundException e) {
					System.out.println(e.getMessage());
				}
			}
			
		} else {
			System.out.println(" Student Record Not Available To Remove");
		}
	}

	@Override
	public void removeAllStudents() {
		if (m.size()!=0) {
			m.clear();
			System.out.println("All Student Records Removed Seccessfully");
		} else {
			try {
				throw new StudentNotFoundException("Student Record Not Found");
			} catch (StudentNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

	@Override
	public void updateStudent() {
		if (m.size() != 0) {
			System.out.println("			1. Update Student name\r\n"
					+ "			2. Update Student Age\r\n"
					+ "			3. Update Student Marks\r\n"
					+ "			4. Upadate Student All Details");
			System.out.println("     Enter Any One Choice");
			int choice = scan.nextInt();
			System.out.println("    Enetr Student ID");
			String id = scan.next();
			id = id.toUpperCase();
			switch (choice) {
			case 1 : {
				System.out.println("    Enter Student Name to Upadate");
				String name = scan.next();
				if (m.containsKey(id)) {
					StudentAttribute a1 = m.get(id);
					a1.setName(name);
					m.replace(id, a1);
					System.out.println(id+" of Student Name updated Successfully to " + name);
				} else {
					try {
						throw new StudentNotFoundException("Student Record Not Found");
					} catch (StudentNotFoundException e) {
						System.out.println(e.getMessage());
					}
				} break;
			}
			case 2 : {
				System.out.println("    Enter Student Age to Upadate");
				int age = scan.nextInt();
				if (m.containsKey(id)) {
					StudentAttribute a1 = m.get(id);
					a1.setAge(age);
					m.replace(id, a1);
					System.out.println(id+" of Student Age updated Successfully to " + age);
				} else {
					try {
						throw new StudentNotFoundException("Student Record Not Found");
					} catch (StudentNotFoundException e) {
						System.out.println(e.getMessage());
					}
				} break;
			}
			case 3 : {
				System.out.println("    Enter Student Marks to Upadate");
				double marks = scan.nextDouble();
				if (m.containsKey(id)) {
					StudentAttribute a1 = m.get(id);
					a1.setMarks(marks);
					m.replace(id, a1);
					System.out.println(id+" of Student Marks updated Successfully to " + marks);
				} else {
					try {
						throw new StudentNotFoundException("Student Record Not Found");
					} catch (StudentNotFoundException e) {
						System.out.println(e.getMessage());
					}
				} break;
			}
			case 4 : {
				System.out.println("    Enter Student Name to Upadate");
				String name = scan.next();
				System.out.println("    Enter Student Age to Upadate");
				int age = scan.nextInt();
				System.out.println("    Enter Student Marks to Upadate");
				double marks = scan.nextDouble();
				if (m.containsKey(id)) {
					StudentAttribute a1 = m.get(id);
					a1.setAge(age); a1.setName(name); a1.setMarks(marks);
					m.replace(id, a1);
					System.out.println(id+" of Student updated All Details Successfully");
				} else {
					try {
						throw new StudentNotFoundException("Student Record Not Found");
					} catch (StudentNotFoundException e) {
						System.out.println(e.getMessage());
					}
				} break;
			}
			default : {
				try {
					throw new InvalidChoiceException("Invalid Choice");
				} catch (InvalidChoiceException e) {
					System.out.println(e.getMessage());
				}
			}
			}
		} else {
			try {
				throw new StudentNotFoundException("Student Records Are Not Available");
			} catch (StudentNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

	@Override
	public void countStudents() {
		if (m.size() == 0) {
			try {
				throw new StudentNotFoundException("Student Record Not Available");
			} catch (StudentNotFoundException e) {
				System.out.println(e.getMessage());
			}
		} else {
			System.out.println("Total Number of Student Records: "+m.size());
		}
	}
	
	@Override
	public void sortStudents() {
		/**
		 * Here is Creating condition statement
		 */
		if(m.size() != 0) {
			/**
			 * Option Displaying to choice from user side
			 */
			System.out.println("			1. sort Student With Id\r\n"
					+ "			2. sort Student With Name\r\n"
					+ "			3. sort Student With Age\r\n"
					+ "			4. sort Student With Marks");
			System.out.println(" Enter One Choice");
			int choice = scan.nextInt();
			/**
			 * Achieving upcasting between List & ArrayList
			 * list can store student objects
			 */
			List<StudentAttribute> l = new ArrayList<StudentAttribute> ();
			for (String s : keys) {
				l.add(m.get(s));
			}
			
			switch (choice) {
			case 1 : {
				Collections.sort(l,new SortStudentById());
				display(l); break;
			}
			case 2 : {
				Collections.sort(l,new SortStudentByName());
				display(l); break;
			}
			case 3 : {
				Collections.sort(l,new SortStudentByAge());
				display(l);  break;
			}
			case 4 : {
				Collections.sort(l,new SortStudentByMarks());
				display(l); break;
			}
			default : {
				try {
					throw new InvalidChoiceException("Choose Currect Choice");
				} catch (InvalidChoiceException e) {
					System.out.println(e.getMessage());
				}
			}
			}
		} else {
			try {
				throw new StudentNotFoundException("Student Records Not Available");
			} catch (StudentNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}	
	}
	
	private static void display(List<StudentAttribute> l) {
		for (StudentAttribute a : l) {
			System.out.println(a);
		}
	}
}