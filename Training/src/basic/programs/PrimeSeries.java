package basic.programs;
import java.util.Scanner;

public class PrimeSeries {
	void prime(int min,int max) {
		for(int i=min;i<=max;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0)
					count++;
			}
			if(count<=2)
				System.out.println(i);
		}
	}
	public static void main(String[] args) {
		int min,max;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two values for printing prime number series inbetween them:");
		min=sc.nextInt();
		max=sc.nextInt();
		PrimeSeries ps=new PrimeSeries();
		ps.prime(min,max);
		sc.close();
	}
}
