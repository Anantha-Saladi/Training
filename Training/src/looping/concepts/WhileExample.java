package looping.concepts;

public class WhileExample {
	public static void main(String args[]) {
		int a[]={1,2,3,4,5,6};
		int n=a.length;
		int i=0,j=5;
		while (i<n) {
			a[i]=j;
			i++;
			j=j+5;
		}
		System.out.println("Final array is:");
		i=0;
		while (i<n) {
			System.out.println(a[i]);
			i++;
		}
	}
}
