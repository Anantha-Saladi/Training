package access.specifiers;

public class PublicExample1 extends PublicExample {
	PublicExample1(int srollno,String sname) {
		super(srollno,sname);
	}
	String departmentName;
	void department(String deptName) {
		departmentName=deptName;
		System.out.println("Student department name="+departmentName);
	}
	public static void main(String[] args) {
		PublicExample1 pe1=new PublicExample1(59,"Anvesh");
		pe1.displayDetails();
		pe1.department("CSE");
		System.out.println("Roll number="+pe1.rollNumber);
	}
	
}
