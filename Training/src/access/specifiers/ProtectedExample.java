package access.specifiers;

public class ProtectedExample {
	protected int rollNumber;
	String studentName;
	protected ProtectedExample(int rollNumber,String studentName) {
		this.rollNumber=rollNumber;
		this.studentName=studentName;
	}
	protected void displayDetails() {
		System.out.println("Student rollnumber="+rollNumber);
		System.out.println("Student name="+studentName);
	}
	public static void main(String[] args) {
		ProtectedExample pe=new ProtectedExample(583,"Anantha");
		pe.displayDetails();
		
	}
}
