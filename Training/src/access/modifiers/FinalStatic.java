package access.modifiers;

public class FinalStatic {
	final static int a=3;
	static void sum()
	{
		final int b=0;
		int t=a+b;
		System.out.println("Sum="+t);
	}
	public static void main(String[] args)
	{
		FinalStatic.sum();
	}
}
