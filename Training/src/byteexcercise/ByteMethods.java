package byteexcercise;

public class ByteMethods {
	public static void main(String[] args) {  
        Byte byte1 = 5 ;  
        Byte byte2 = 67 ;  
        //compares the two specified byte values  
        int val = Byte.compare(byte1,byte2);  
        if (val>0) {  
            System.out.println(byte1 + " is greater than " + byte2);  
        }  
        else{  
            System.out.println(byte2 + " is greater than " + byte1);  
        }  
        // hash code of byte value byte1  
        int f1 = byte1.hashCode();  
        System.out.println("Hash code value of "+byte1+ " is : "+f1);  
       //returns the value of this Byte as a Float  
        Float f2 = byte2.floatValue();  
        System.out.println("Float value of "+byte2+ " is : "+f2);  
        //returns the value of this Byte as a Float  
        Integer f3 = byte2.intValue();  
        System.out.println("Integer value of "+byte2+ " is : "+f3);  
        //decodes a String into a Byte  
        String str="123";  
        Byte f4 = Byte.decode(str);  
        System.out.println("Decoded value of "+str+ " is : "+f4);  
    }  
}
