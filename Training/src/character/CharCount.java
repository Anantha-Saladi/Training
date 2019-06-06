package character;

public class CharCount {
	public static void main(String[] args) {  
	    int obj1 = 59;  
	    int obj2 = 154676;  
	// Check the number of char values needed and print the values.  
	       int r1 = Character.charCount(obj1);  
	System.out.println("The first object " + obj1 + " can be represented by "+ r1 + " char values");  
	    int r2 = Character.charCount(obj2);  
	System.out.println("The second object " + obj2 + " can be represented by " + r2 + " char values");  
	    }  
}
