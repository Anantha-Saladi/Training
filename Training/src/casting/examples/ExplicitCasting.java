package casting.examples;

public class ExplicitCasting 
{
	public static void main(String[] args)
	{
		double Double_Value=10.895;
		float Float_Value=(float) Double_Value;
		long Long_Value=(long)Float_Value;
		int Integer_Value=(int)Long_Value;
		byte Byte_Value=(byte)Integer_Value;
		System.out.println("Double value="+Double_Value);
		System.out.println("Float value="+Float_Value);
		System.out.println("Long value="+Long_Value);
		System.out.println("Integer value="+Integer_Value);
		System.out.println("Byte value="+Byte_Value);
	}
}
