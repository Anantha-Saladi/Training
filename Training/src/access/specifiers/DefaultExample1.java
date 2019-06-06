package access.specifiers;

public class DefaultExample1 extends DefaultExample {
	public DefaultExample1(int rno, String sName)  {
		super(rno, sName);
	
	}
	String departmentName;
	void department(String deptName) {
			departmentName=deptName;
			System.out.println("Student department name="+departmentName);
	}
	public static void main(String[] args) {
		ProtectedExample3 pe3=new ProtectedExample3(465,"Anu");
		pe3.displayDetails();
		pe3.department("CSE");
		System.out.println("Value of roll number="+pe3.rollNumber);
	}
}
