package com.jspiders;

public class StudentAttribute {
	
	private String id;
	private int age;
	private String name;
	private double marks;
	private static int count = 101;
	
	StudentAttribute (String name,int age, double marks) {
		this.id = "JSP"+count;
		this.age = age;
		this.name = name;
		this.marks = marks;
		count++;
	}
	
	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		StudentAttribute.count = count;
	}

	@Override
	public String toString() {
		return "Student Records [id=" + id + ", age=" + age + ", name=" + name + ", marks=" + marks + "]";
	}
}
