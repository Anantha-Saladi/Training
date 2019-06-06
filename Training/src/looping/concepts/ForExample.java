package looping.concepts;

public class ForExample {
	public static void main(String args[]) {
		int a[]={1,2,3,4,5,6};
		int n=a.length;
		for(int i=0,j=5;i<n;i++,j=j+5)
			a[i]=j;
		System.out.println("Final array is:");
		for(int i=0;i<n;i++)
			System.out.println(a[i]);	
	}
}
