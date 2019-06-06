package com.anantha;

import access.specifiers.PublicExample;

public class PublicExample2 {
	String departmentName;
	void department(String deptName) {
		departmentName=deptName;
		System.out.println("Student department name="+departmentName);
	}
	public static void main(String[] args) {
		PublicExample2 pe2=new PublicExample2();
	    PublicExample p=new PublicExample(34,"Varun");
		p.displayDetails();
		pe2.department("CSE");
		System.out.println("Value of roll number="+p.rollNumber);
	}
	
}
