package looping.concepts;

public class DoWhile {
	public static void main(String args[]) {
		int a[]={1,2,3,4,5,6};
		int n=a.length;
		int i=0,j=5;
	    do {
			a[i]=j;
			i++;
			j=j+5;
	    } while(i<n);
		System.out.println("Final array is:");
		i=0;
		do {
			System.out.println(a[i]);
			i++;
		} while(i<n);
	}
}
