package com.anantha;
import access.specifiers.DefaultExample;

public class DefaultExample2 {
	String departmentName;
	void department(String deptName) {
		departmentName=deptName;
		System.out.println("Student department name="+departmentName);
	}
	public static void main(String[] args) {
		DefaultExample2 pe2=new DefaultExample2();
		DefaultExample p=new DefaultExample(76,"Anusha");
		p.displayDetails();
		pe2.department("CSE");
		System.out.println("Value of roll number="+p.rollNumber);
	}
}
