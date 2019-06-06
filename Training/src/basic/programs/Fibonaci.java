package basic.programs;

import java.util.Scanner;

public class Fibonaci {
	void fibonaci(int n) {
		int n1=0,n2=1,sum;
		System.out.println(n1);
		System.out.println(n2);
		for(int i=3;i<=n;i++) {
			sum=n1+n2;
			n1=n2;
			n2=sum;
			System.out.println(sum);
		}
	}
	public static void main(String[] args) {
		int number;
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		Fibonaci f=new Fibonaci();
		f.fibonaci(number);
		sc.close();
	}
}
