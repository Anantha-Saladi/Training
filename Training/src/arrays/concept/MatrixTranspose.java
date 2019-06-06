package arrays.concept;
import java.util.Scanner;

public class MatrixTranspose {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rows,columns,i,j;
		System.out.println("Enter no of rows and columns in a matrix");
		rows=sc.nextInt();
		columns=sc.nextInt();
		System.out.println("Enter "+rows+"*"+columns+"matrix");
		int a[][]=new int[rows][columns];
		for(i=0;i<rows;i++) 
			for(j=0;j<columns;j++)
				a[i][j]=sc.nextInt();
		int transpose[][]=new int[rows][columns];
		for(i=0;i<rows;i++) 
			for(j=0;j<columns;j++)	
				transpose[j][i]=a[i][j];
		System.out.println("Transpose of given matrix is:");
		for(i=0;i<rows;i++) {
			for(j=0;j<columns;j++)
				System.out.print(transpose[i][j]+"  ");
			System.out.println();
		}
		sc.close();
	}
}