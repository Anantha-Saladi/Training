package basic.programs;
import java.util.Scanner;
public class Palindrome {
	void palindrome(int n) {
		int remainder,temp,rev=0;
		temp=n;
		while(temp!=0) {
			remainder=temp%10;
			rev=rev*10+remainder;
			temp=temp/10;
		}
		if(rev==n)
			System.out.println("Given number"+n+" is palindrome");
		else
			System.out.println("Given number"+n+" is not palindrome");
	}
	public static void main(String[] args) {
		int number;
		System.out.println("Enter a value:");
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		Palindrome p=new Palindrome();
		p.palindrome(number);
		sc.close();
	}
}
