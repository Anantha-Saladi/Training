package access.specifiers;

public class PrivateExample {
	private int rollNumber;
	String studentName;
	private PrivateExample(int rollNumber,String studentName) {
		this.rollNumber=rollNumber;
		this.studentName=studentName;
	}
	private void displayDetails() {
		System.out.println("Student rollnumber="+rollNumber);
		System.out.println("Student name="+studentName);
	}
	public static void main(String[] args) {
		PrivateExample pe=new PrivateExample(583,"Anantha");
		pe.displayDetails();
		
	}
}
