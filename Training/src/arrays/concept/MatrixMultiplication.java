package arrays.concept;

import java.util.Scanner;

public class MatrixMultiplication {
	public static void main(String[] args) {
		int rows1,columns1,i,j,k,rows2,columns2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows and columns for first matrix");
		rows1=sc.nextInt();
		columns1=sc.nextInt();
		System.out.println("Enter no of rows and columns for second matrix");
		rows2=sc.nextInt();
		columns2=sc.nextInt();
		if(columns1!=rows2)
			System.out.println("Multiplication is not possible");
		else {
		System.out.println("Enter "+rows1+"*"+columns1+"matrix");
		int a[][]=new int[rows1][columns1];
		for(i=0;i<rows1;i++) {
			for(j=0;j<columns1;j++)
				a[i][j]=sc.nextInt();
		}
		System.out.println("Enter "+rows2+"*"+columns2+" matrix");
		int b[][]=new int[rows2][columns2];
		for(i=0;i<rows2;i++) {
			for(j=0;j<columns2;j++)
				b[i][j]=sc.nextInt();
		}
		int result[][]=new int[rows1][columns2];
		for(i=0;i<rows1;i++) 
			for(j=0;j<columns2;j++) {
				result[i][j]=0;
				for(k=0;k<columns1;k++)
					result[i][j]=a[i][k]*b[k][j]+result[i][j];
			}
		System.out.println("Multiplication of two matrices:");
		for(i=0;i<rows1;i++) {
			for(j=0;j<columns2;j++)
				System.out.print(result[i][j]+"  ");
			System.out.println();
		}
		}
		sc.close();
	}
}
