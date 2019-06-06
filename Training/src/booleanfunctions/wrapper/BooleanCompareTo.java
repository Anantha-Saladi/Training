package booleanfunctions.wrapper;

public class BooleanCompareTo {
	public static void main(String[] args) {  
		  Boolean b1 =new Boolean(true);  
	        Boolean b2 = new Boolean(false);  
        //compare b1 with b2  
        int b3 = b1.compareTo(b2);  
        if(b3==0) {  
            System.out.println("Both values are equal");  
        }    
        else {  
            System.out.println("Both values are notequal");  
        }  
    }  
}
