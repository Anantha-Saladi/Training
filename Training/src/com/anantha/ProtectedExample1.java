package com.anantha;
import access.specifiers.ProtectedExample;

public class ProtectedExample1 extends ProtectedExample {
	
	public ProtectedExample1(int rno, String sName) {
		super(rno, sName);
	
	}
	String departmentName;
	void department(String deptName) {
			departmentName=deptName;
			System.out.println("Student department name="+departmentName);
	}
	public static void main(String[] args) {
		ProtectedExample1 pe2=new ProtectedExample1(465,"Anu");
		pe2.displayDetails();
		pe2.department("CSE");
		System.out.println("Value of roll number="+pe2.rollNumber);
	}
}
