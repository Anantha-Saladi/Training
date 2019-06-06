package booleanfunctions.wrapper;

public class BooleanValue {
	public static void main(String[] args) {  
        // here we have created boolean object b  
        Boolean b1 = new Boolean(true);  
        boolean b2;  
        //assigning boolean value of b1 to b2  
        b2= b1.booleanValue();  
        System.out.println("Value of b1 is:"+b1+" value of b2 is:"+b2);  
        System.out.println();  
        Boolean b3 = new Boolean(true);  
        //assigning boolean value of b3 to b4  
        boolean b4 = b3;  
        System.out.println("Value of b3 is:"+b3+" value of b4 is:"+b4);  
  
          }  
}
