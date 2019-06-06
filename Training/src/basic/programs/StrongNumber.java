package basic.programs;

import java.util.Scanner;

public class StrongNumber {
	
	void strongNumber(int n) {
		
		int remainder,temp,result=0;
		temp=n;
		while(temp!=0) {
			remainder=temp%10;
			int y=factorial(remainder);
			result=result+y;
			temp=temp/10;
		}
		if(n==result)
			System.out.println("Given number is strong number");
		else
			System.out.println("not a strong number");
	}
	int factorial(int x) {
		int fact=1;
		for(int i=1;i<=x;i++) {
			
			fact=fact*i;
		}
		return (fact);
	}
	public static void main(String[] args) {
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		number=sc.nextInt();
		StrongNumber sn=new StrongNumber();
		sn.strongNumber(number);
		sc.close();
	}
}
