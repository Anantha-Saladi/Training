package access.modifiers;

public class FinalVariable {
	int m1=82;
	int m2=72;
	final int total=0;
	void numbersSum()
	{
		//total=m1+m2;
		 System.out.println("Sum of two subjects marks="+total);
	}
	public static void main(String[] args)
	{
		FinalVariable fv=new FinalVariable();
		fv.numbersSum();
	}
}
