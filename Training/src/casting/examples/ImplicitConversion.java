package casting.examples;

public class ImplicitConversion
{
	public static void main(String args[])
	{
		int Integer_Value=10;
		long Long_Value=Integer_Value;
		float Float_Value=Long_Value;
		double Double_Value=Float_Value;
		System.out.println("Integer value="+Integer_Value);
		System.out.println("Integer value="+Long_Value);
		System.out.println("Integer value="+Float_Value);
		System.out.println("Integer value="+Double_Value);
		
	}

}
