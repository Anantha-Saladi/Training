package searching.techniques;
import java.util.Scanner;

class BinarySearch { 
	int binarySearch(int arr[], int f, int l, int x)  { 
		if (l>=f) { 
			int mid = f+(l-f)/2; 
			if (arr[mid] == x) 
				return mid; 

			else if(arr[mid] > x) 
            	return binarySearch(arr,f, mid-1, x); 
            else 
            	return binarySearch(arr, mid+1,l, x); 
	}
     return -1; 
 } 

 public static void main(String args[])  { 
     BinarySearch ob = new BinarySearch(); 
     int a[] = {2,3,4,10,40}; 
     int n = a.length; 
     int search;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a value to search:");
     search=sc.nextInt();
     int result = ob.binarySearch(a,0,n-1,search); 
     if (result == -1) 
         System.out.println("Element not present"); 
     else
         System.out.println("Element found at index "+(result+1)); 
     sc.close();
 } 
} 