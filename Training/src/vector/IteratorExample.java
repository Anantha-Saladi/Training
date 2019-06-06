package vector;
import java.util.*;

public class IteratorExample {
	public static void main(String arg[]) {   
        //Create an empty Vector        
        Vector < String > colors = new Vector < String > ();  
        //Add color elements in the vector  
            colors.add("Red");  
            colors.add("Green");  
            colors.add("Blue");  
            colors.add("Pink");  
            colors.remove("Red");
            //Obtain an Iterator  
            Iterator<String> itr = colors.iterator();  
            while(itr.hasNext()){  
                 System.out.println(itr.next());  
            }   
            colors.removeAllElements();
            System.out.println(colors.size());
           // System.out.println(colors.size());
            //colors.trimToSize();
            //System.out.println(colors.capacity());
            System.out.println("Vector is empty="+colors.isEmpty());
	}
}
