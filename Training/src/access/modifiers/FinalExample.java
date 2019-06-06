package access.modifiers;

public class FinalExample {
	int marks1=30,marks2=20;
	int total;

   final void sumOfNumbers()
    {
	    total=marks1+marks2;
    	System.out.println("sum of two subjects marks="+total);
    }
    public static void main(String[] args)
    {
      	System.out.println(StaticExample.marks1);
    	System.out.println(StaticExample.marks2);
    	StaticExample.sumOfNumbers();
    }
}
