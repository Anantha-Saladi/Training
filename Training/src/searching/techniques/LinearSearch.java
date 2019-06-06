package searching.techniques;
import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		int a[]= { 21,31,12,42,5 };
		int n=a.length,i;
		for(i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int search;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Sorted array is:");
		for( i=0; i<n; i++)
			System.out.println(a[i]+" ");
		
		System.out.println("Enter a value to search:");
		search=sc.nextInt();
		
		for(i=0;i<n;i++) {
			if(a[i]==search)
				System.out.println("Element "+search+" found at location:"+(i+1));
		}
		if(i>n)
			System.out.println("Element not found");
		sc.close();
	}
}
