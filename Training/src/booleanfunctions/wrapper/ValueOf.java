package booleanfunctions.wrapper;

public class ValueOf {
	public static void main(String[] args) {
		Boolean b1 = true;  
	    // will return a boolean instance corresponding to Boolean b1  
	    Boolean b2 = Boolean.valueOf(b1);  
	    System.out.println("valueOf() method will return = "+b2);  
	    Boolean b3 = Boolean.valueOf(false);  
	    System.out.println("valueOf() method will return = "+b3);  
	}
}