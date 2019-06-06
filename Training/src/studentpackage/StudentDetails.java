package studentpackage;

public class StudentDetails 
{
	String Student_Name;
	int Roll_Number;
	String Student_Department;
	
	public StudentDetails(String sname,int sno,String dept)
	{
		Student_Name=sname;
		Roll_Number=sno;
		Student_Department=dept;
	}
	//prints student details
	
   public void studentDetails()
	{
		System.out.println("Student name="+Student_Name);
		System.out.println("Student roll number="+Roll_Number);
		System.out.println("Student department name="+Student_Department);
	}
}
