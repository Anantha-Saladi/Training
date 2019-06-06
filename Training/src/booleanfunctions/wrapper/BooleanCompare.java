package booleanfunctions.wrapper;

public class BooleanCompare {
	 public static void main(String[] args) {  
	        Boolean b1 =new Boolean(false);  
	        Boolean b2 = new Boolean(false);  
	        int b3 = Boolean.compare(b1,b2);  
	        if(b3==0){  
	            System.out.println("Both values are equal");  
	        } 
	        else {  
	            System.out.println("Both values are not equal");  
	        }  
	    }  
}
