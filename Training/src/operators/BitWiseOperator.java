package operators;
import java.util.Scanner;

public class BitWiseOperator {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two values");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("BitWise AND operation:"+(a&b));
		System.out.println("BitWise OR operation:"+(a|b));
		System.out.println("BitWise XOR operation:"+(a^b));
		System.out.println("BitWise COMPLEMENT of a:"+(~a));
		System.out.println("BitWise COMPLEMENT of b:"+(~b));
		System.out.println("BitWise leftshift operation:"+(a<<1));
		System.out.println("BitWise rightshift operation:"+(a>>1));
		s.close();
	}
}
