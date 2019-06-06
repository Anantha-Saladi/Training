package sorting.algorithms;

public class BubbleSort { 
     	public static void main(String[] args) {  
     		int[] a = {10, 9, 7, 3, 23, 4, 12, 78, 34, 6}; 
     		int n=a.length;
     		for(int i=0;i<n;i++)  
     		{  
     			for (int j=0;j<n;j++)  
     			{  
     				if(a[i]<a[j])  
     				{  
     					int temp = a[i];  
     					a[i]=a[j];  
     					a[j] = temp;   
     				}  
     			}  
     		}  
     		System.out.println("Printing Sorted List ...");  
     		for(int i=0;i<n;i++)  
     		{  
     			System.out.println(a[i]);  
     		}  
     	}  
}  

