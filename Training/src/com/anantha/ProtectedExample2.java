package com.anantha;
import access.specifiers.ProtectedExample;

public class ProtectedExample2 {
	
		String departmentName;
		void department(String deptName) {
			departmentName=deptName;
			System.out.println("Student department name="+departmentName);
		}
		public static void main(String[] args) {
			ProtectedExample2 pe2=new ProtectedExample2();
			ProtectedExmple p=new ProtectedExample(76,"Anusha");
			p.displayDetails();
			pe2.department("CSE");
			System.out.println("Value of roll number="+p.rollNumber);
		}
}
