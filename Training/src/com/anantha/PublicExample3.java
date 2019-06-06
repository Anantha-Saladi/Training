package com.anantha;

import access.specifiers.PublicExample;

public class PublicExample3 extends PublicExample {
	
	public PublicExample3(int rno, String sName) {
		super(rno, sName);
	
	}
	String departmentName;
	void department(String deptName) {
			departmentName=deptName;
			System.out.println("Student department name="+departmentName);
	}
	public static void main(String[] args) {
		PublicExample3 pe3=new PublicExample3(465,"Anusha");
		pe3.displayDetails();
		pe3.department("CSE");
		System.out.println("Value of roll number="+pe3.rollNumber);
	}
}

