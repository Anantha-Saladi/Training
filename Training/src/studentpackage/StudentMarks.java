package studentpackage;

public class StudentMarks extends StudentAddress 
{
	int marks1,marks2,marks3,Total_Marks;
	float percentage;
	
	public StudentMarks(int m1,int m2,int m3)
	{
		super(123,"Satyawada","Draksharamam");//calls superclass constructor
		marks1=m1;
		marks2=m2;
		marks3=m3;
	}
	//prints student address and marks
	
	public void studentMarks()
	{
		super.studentAddress();
		System.out.println("Marks of student in one subject="+marks1);
		System.out.println("Marks of student in second subject="+marks2);
		System.out.println("Marks of student in third subject="+marks3);
	}
	//calculates percentage and print its value
	
	public void studentPercentage()
	{
		Total_Marks=marks1+marks2+marks3;
		percentage = ((float) Total_Marks/300) * 100;
		//percentage=temp/300;
		System.out.println("Student percentage="+percentage);
	}
	
}
