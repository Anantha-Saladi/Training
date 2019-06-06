package byteexcercise;

public class ByeMethod2 {
	 public static void main(String[] args) {  
	        Byte byte1 = 5 ;  
	        Byte byte2 = 67 ;  
	       // It compares two Byte objects numerically  
	        int val = byte1.compareTo(byte2);  
	        if (val>0) {  
	            System.out.println(byte1 + " is greater than " + byte2);  
	        }  
	        else{  
	            System.out.println(byte2 + " is greater than " + byte1);  
	        }  
	        //It is used check whether both values are equal or not.  
	        Boolean b1 = byte1.equals(byte2);  
	        if (b1) {  
	            System.out.println(byte1 + " and " + byte2 +" are equal.");  
	        }  
	        else{  
	            System.out.println(byte1 + " and " + byte2 +" are not equal.");  
	        }  
	        //returns the value of this Byte as a long  
	        Long f3 = byte2.longValue();  
	        System.out.println("Long value of "+byte2+ " is : "+f3);  
	        //Returns a string representation of the Byte?s object  
	        String f4 = byte2.toString();  
	        System.out.println("String value of "+byte2+ " is : "+f4);  
	       //It returns a double value for this Byte object  
	        Double f5 = byte1.doubleValue();  
	        System.out.println("Double value of "+byte1+ " is : "+f5);  
	    }  
}
