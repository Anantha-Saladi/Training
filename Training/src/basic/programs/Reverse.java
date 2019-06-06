package basic.programs;
import java.util.Scanner;

import java.io.*;

public class Reverse {
	 int remainder,temp=0;
	 void reverse(int n) {
		int num=n;
		 while(num!=0) {
			 remainder=num%10;
			 temp=temp*10+remainder;
			 num=num/10;
		 }
		 System.out.println("Reverse of"+n+" is="+temp);
	 }
	 public static void main(String args[])throws IOException {
		 Scanner sc=new Scanner(System.in);
		 //InputStreamReader r=new InputStreamReader(System.in);
		 //BufferedReader br=new BufferedReader(r);
		 System.out.println("Enter value for number");
		 int number=sc.nextInt();
		 Reverse rev=new Reverse();
		 rev.reverse(number);
		 sc.close();
	 }
}