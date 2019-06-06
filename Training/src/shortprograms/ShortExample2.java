package shortprograms;

public class ShortExample2 {
	static int i=1;  
    public static void main(String[] args) {  
        Short short1 = 50 ;  
        Short short2 = 607 ;  
        //compares the two specified short values  
        int val = Short.compare(short1,short2);  
        if (val>0) {  
            System.out.println(i++ + ". "+short1 + " is greater than " + short2);  
        }  
        else{  
            System.out.println(i++ + ". "+short2 + " is greater than " + short1);  
        }  
        // returns the hash code of short value short1  
        int f1 = short1.hashCode();  
        System.out.println(i++ + ". "+"Hash code value of "+short1+ " is : "+f1);  
       //returns the value of this Short as a Float  
        Float f2 = short2.floatValue();  
        System.out.println(i++ + ". "+"Float value of "+short2+ " is : "+f2);  
        //returns the value of this Short as a Float  
        Integer f3 = short2.intValue();  
        System.out.println(i++ + ". "+"Integer value of "+short2+ " is : "+f3);  
        //decodes a String into a Short  
        String str="123";  
        Short f4 = Short.decode(str);  
        System.out.println(i++ + ". "+"Decoded value of string value "+str+ " is : "+f4);  
    }  
}
