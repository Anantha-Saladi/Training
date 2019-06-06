package studentpackage;

public class StudentAddress extends StudentDetails
{
	int Door_Number;
	String Village_Name;
	String City_Name;
	
	public StudentAddress(int do_no,String vname,String cname)
	{
		super("Anantha",583,"CSE"); //calls superclass constructor
		Door_Number=do_no;
		Village_Name=vname;
	    City_Name=cname;
	}
	//prints studentdetails and address
	
	public void studentAddress()
	{
		super.studentDetails();
		System.out.println("Student door number="+Door_Number);
		System.out.println("Student village name="+Village_Name);
		System.out.println("City of the student="+City_Name);
	}
	
}
