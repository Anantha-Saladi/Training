package basic.programs;
import java.util.Scanner;
public class SwapNumbers {
	void swap(int x,int y) {
		int a=x,b=y;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("value of a="+a);
		System.out.println("Value of b="+b);
	}
	public static void main(String[] args) {
		SwapNumbers sn=new SwapNumbers();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two values");
		int num1=s.nextInt();
		int num2=s.nextInt();
		sn.swap(num1,num2);
		s.close();
	}

}
