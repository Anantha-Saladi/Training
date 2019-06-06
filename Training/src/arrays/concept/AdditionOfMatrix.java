package arrays.concept;
import java.util.Scanner;

public class AdditionOfMatrix {
	public static void main(String[] args) {
		int rows,columns,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows and columns in a matrix");
		rows=sc.nextInt();
		columns=sc.nextInt();
		System.out.println("Enter "+rows+"*"+columns+"matrix");
		int a[][]=new int[rows][columns];
		for(i=0;i<rows;i++) {
			for(j=0;j<columns;j++)
				a[i][j]=sc.nextInt();
		}
		System.out.println("Enter "+rows+"*"+columns+" matrix");
		int b[][]=new int[rows][columns];
		for(i=0;i<rows;i++) {
			for(j=0;j<columns;j++)
				b[i][j]=sc.nextInt();
			System.out.println();
		}
		int result[][]=new int[rows][columns];
		for(i=0;i<rows;i++) 
			for(j=0;j<columns;j++)
				result[i][j]=a[i][j]+b[i][j];
		System.out.println("Addition of two matrices:");
		for(i=0;i<rows;i++) {
			for(j=0;j<columns;j++)
				System.out.print(result[i][j]+"  ");
			System.out.println();
		}
		sc.close();
	}
}