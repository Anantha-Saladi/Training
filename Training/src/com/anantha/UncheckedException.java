package com.anantha;

public class UncheckedException {
	public static void main(String args[])
	{
	    try
	    {
	         int a = 10/0;
	         System.out.println("Access element three :" + a);
	        
	    } 
	    
	    catch(ArithmeticException ex)
	    {
	    	System.out.println("Exception thrown  :" + ex);
	    	try
	    	{
	    		int ar[]=new int[4];
	    		System.out.println("Value at index 6="+ar[6]);
	    	}
	    	catch (Exception e)
	    	{
	    		System.out.println("Exception thrown  :" + e);
	    	}
	    }
	    System.out.println("Out of the block");
	   
	}
}
