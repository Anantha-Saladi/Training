package vector;
import java.util.*;

public class CloneExample {
	public static void main(String arg[]) {  
        //Create an empty Vector vec with an initial capacity of 4        
          Vector vc = new Vector(4);  
          Vector vecclone = new Vector(4);  
          //Add elements in the vector  
          vc.add(4);  
          vc.add(3);  
          vc.add(2);  
          vc.add(1);  
          //Print all the elements available in vector  
          System.out.println("Elements in vector are: ");     
          for(int i=0;i<vc.size();i++) {
        	  System.out.println(vc.get(i));
          }
          //clone the vector vec  
          vecclone = (Vector) vc.clone();  
          //Print all the elements available in vecclone  
          System.out.println("Elements in vecclone vector are: ");                  
          for(int i=0;i<vc.size();i++) {
        	  System.out.println(vecclone.get(i));
          }
    }              
}
