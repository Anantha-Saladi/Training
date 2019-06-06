import java.util.Scanner;
public class CharArray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter character array:");
		 char[] array=s.next().toCharArray();
		 System.out.println("Array elements are : ");
	     for (int i=0;i<array.length;i++)
	          System.out.println(array[i]);
	     System.out.println("Enter a character:");
	     char c;
	     c=s.next().charAt(0);
	     System.out.println(c);
	}
}
