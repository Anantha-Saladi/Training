package booleanfunctions.wrapper;

public class ToString {
	public static void main(String[] args) {  
        Boolean b1 = true;  
        System.out.println("Boolean value = "+b1);  
        System.out.println("Hash Code for boolean value = "+b1.hashCode());  
        //converting boolean value tp String  
        String str = b1.toString();  
        System.out.println("String value = "+str);  
        System.out.println("Hash Code for String Value = "+str.hashCode());  
  
    }  
}
