package operators;
import java.util.Scanner;

public class RelationalOperators {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two values");
		int a=s.nextInt();
		int b=s.nextInt();
		if(a>=b)
			System.out.println(a+" is greater than or equal to "+b);
		if(a==b)
			System.out.println(a+" is equal to "+b);
		else
			System.out.println(a+" is not equal to "+b);
		if(a<b)
			System.out.println(a+" is less than "+b);
		s.close();
	}
}
