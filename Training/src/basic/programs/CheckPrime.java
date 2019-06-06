package basic.programs;
import java.util.Scanner;

public class CheckPrime {
	void prime(int value) {
		int number=value;
		int count=0,flag=0;
		for(int i=1;i<number;i++) {
			if(number%i==0) 
				count++;
			if(count>2) {
				flag=1;
				break;
			}
		}
		if(flag==1)
			System.out.println("Given number"+number+" is not prime");
		else
			System.out.println("Given number"+number+" is prime");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr a value to check for prime:");
		int value=sc.nextInt();
		CheckPrime cp=new CheckPrime();
		cp.prime(value);
		sc.close();
	}
}
