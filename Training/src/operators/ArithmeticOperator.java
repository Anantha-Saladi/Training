package operators;
import java.util.Scanner;

public class ArithmeticOperator {
	void addition(int num1,int num2) {
		int result = num1 + num2;
		System.out.println("Addition of"+num1+" and "+num2+" is:"+result);
	}
	
	void subtraction(int num1,int num2) {
		int result = num1 - num2;
		System.out.println("Subtraction of"+num1+" and "+num2+" is:"+result);
	}
	
	void multiplication(int num1 , int num2) {
		int result = num1 * num2;
		System.out.println("Multiplication of"+num1+" and "+num2+" is:"+result);
	}
	void division (int num1 , int num2) {
		int result =num1 / num2;
		System.out.println("Division of"+num1+" and "+num2+" is:"+result);
	}
	void modulus(int num1 , int num2) {
		int result = num1 % num2;
		System.out.println("Modulus of"+num1+" and "+num2+" is:"+result);
	}
	
	public static void main(String[] args) {
		ArithmeticOperator ao=new ArithmeticOperator();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two values:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		ao.addition(num1,num2);
		ao.subtraction(num1,num2);
		ao.multiplication(num1,num2);
		ao.division(num1,num2);
		ao.modulus(num1,num2);
		sc.close();
	}
}
