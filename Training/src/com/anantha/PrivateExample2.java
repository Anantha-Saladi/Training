package com.anantha;
import access.specifiers.PrivateExample;

public class PrivateExample2 {
	String departmentName;
	void department(String deptName) {
		departmentName=deptName;
		System.out.println("Student department name="+departmentName);
	}
	public static void main(String[] args) {
		PrivateExample2 pe2=new PrivateExample2();
		PrivateExample p=new PrivateExample(76,"Anusha");
		p.displayDetails();
		pe2.department("CSE");
		System.out.println("Value of roll number="+p.rollNumber);
	}
}
