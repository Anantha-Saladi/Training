package com.anantha;
import access.specifiers.PrivateExample;

public class DefaultExample3 extends DefaultExample {
	public DefaultExample3(int rno, String sName) {
		super(rno, sName);
	
	}
	String departmentName;
	void department(String deptName) {
			departmentName=deptName;
			System.out.println("Student department name="+departmentName);
	}
	public static void main(String[] args) {
		DefaultExample3 pe2=new DefaultExample3(465,"Anu");
		pe2.displayDetails();
		pe2.department("CSE");
		System.out.println("Value of roll number="+pe2.rollNumber);
	}


}
