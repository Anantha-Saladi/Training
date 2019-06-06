package booleanfunctions.wrapper;

public class ParseBoolean {
        public static void main(String[] args) {  
            String str1 = "true";  
            System.out.println("String value = "+str1);  
            System.out.println("String hash code value = "+str1.hashCode());  
            //it will return String argument as boolean  
            Boolean b1 = Boolean.parseBoolean(str1);  
            System.out.println("Boolean value = "+b1);  
            System.out.println("Boolean hash code value = "+b1.hashCode());  
        }   
}
