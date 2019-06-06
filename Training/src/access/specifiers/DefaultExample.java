package access.specifiers;

public class DefaultExample {
	int rollNumber;
	String studentName;
	DefaultExample(int rollNumber,String studentName) {
		this.rollNumber=rollNumber;
		this.studentName=studentName;
	}
	void displayDetails() {
		System.out.println("Student rollnumber="+rollNumber);
		System.out.println("Student name="+studentName);
	}
	public static void main(String[] args) {
		PublicExample pe=new PublicExample(583,"Anantha");
		pe.displayDetails();
		
	}
}
