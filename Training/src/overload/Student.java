package overload;
class Student {
	int m1,m2,m3,Total_Marks;
	Student() {
		m1=82;
		m2=72;
		m3=76;
	}
	Student(int a,int b,int c) {
		m1=a;
		m2=b;
		m3=c;
	}
	void sumOfMarks() {
		Total_Marks=m1+m2+m3;
		System.out.println("Total marks of three subjects="+Total_Marks);
	}
	void sumOfMarks(int x,int y,int z) {
		Total_Marks=x+y+z;
		System.out.println("Total of three subjects marks="+Total_Marks);
	}
	public static void main(String args[]) {
		Student s=new Student();
		s.sumOfMarks();
		Student s1=new Student(81,89,79);
		s1.sumOfMarks();
		s.sumOfMarks(12,23,34);
	}
}
	
