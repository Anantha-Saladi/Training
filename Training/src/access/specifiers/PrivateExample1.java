package access.specifiers;

public class PrivateExample1 extends PrivateExample {
	public PrivateExample1(int rno, String sName)  {
		super(rno, sName);
	
	}
	String departmentName;
	void department(String deptName) {
			departmentName=deptName;
			System.out.println("Student department name="+departmentName);
	}
	public static void main(String[] args) {
		PrivateExample1 pe3=new PrivateExample1(465,"Anu");
		pe3.displayDetails();
		pe3.department("CSE");
		System.out.println("Value of roll number="+pe3.rollNumber);
	}
}
