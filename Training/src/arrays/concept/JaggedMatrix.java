package arrays.concept;
import java.util.Scanner;

public class JaggedMatrix {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int array[][]=new int[3][];
		array[0]=new int[5];
		array[1]=new int[4];
		array[2]=new int[4];
		for(int i=0;i<array.length;i++) {
			System.out.println("Enter "+i+"th row elements");
			for(int j=0;j<array[i].length;j++) {
				array[i][j]=sc.nextInt();
			}
		}
		System.out.println("The jagged array is:");
		for(int i=0;i<array.length;i++) {
			System.out.println();
				for(int j=0;j<array[i].length;j++) {
					System.out.print(array[i][j]+"   ");
				}
		}
		sc.close();
	}
}
