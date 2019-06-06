package arrays.concept;
import java.util.Scanner;

public class DynamicArray {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a character array:");
	char[] array=s.nextLine().toCharArray();
	 System.out.println("Array elements are : ");
    for (int i=0;i<array.length;i++)
         System.out.print(array[i]);
    s.close();
	}
}
