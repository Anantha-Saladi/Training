package arrays.concept;
import java.util.Scanner;

public class InverseOfMatrix {
	public static void main(String[] args) {
		int m,i,j;
		Scanner sc=new Scanner(System.in);
		float determinant=0;
	    System.out.println("Enter a value for order of matrix:");
	    m=sc.nextInt();
	    int a[][]=new int[m][m];
	    System.out.println("Enter"+m+"*"+m+" matrix:");
		  for(i=0;i<m;i++)
		      for(j=0;j<m;j++)
		          a[i][j]=sc.nextInt();

		  System.out.println("The matrix is:");
		  for(i=0;i<m;i++) {
		      for(j=0;j<m;j++)
		           System.out.print(a[i][j]+"  ");
		      System.out.println();
		  }

		  for(i=0;i<m;i++)
		      determinant = determinant + (a[0][i]*(a[1][(i+1)%m]*a[2][(i+2)%m] - a[1][(i+2)%m]*a[2][(i+1)%m]));
		  
		  System.out.println("Inverse of matrix is:");
		   for(i=0;i<m;i++) {
		      for(j=0;j<m;j++)
		           System.out.print(((a[(i+1)%m][(j+1)%m] * a[(i+2)%m][(j+2)%m]) - (a[(i+1)%m][(j+2)%m]*a[(i+2)%m][(j+1)%m]))/ determinant+"  ");
		       System.out.println();
		   }
		   sc.close();
	}
}
