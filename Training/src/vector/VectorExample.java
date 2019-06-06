package vector;
import java.util.*;

public class VectorExample {
	public static void main(String args[]) {
	      /* Vector of initial capacity(size) of 2 */
	      Vector vec = new Vector(2);
	      System.out.println("Default capacity is: "+vec.capacity());
	      /* Adding elements to a vector*/
	      vec.addElement("mokshi");
	      vec.addElement("souju");
	      vec.addElement("surya");
	      System.out.println("Size is: "+vec.size());
	      vec.removeElement("surya");

	      /* check size and capacityIncrement*/
	      System.out.println("Size is: "+vec.size());
	      System.out.println("Default capacity increment is: "+vec.capacity());

	      vec.addElement("anantha");
	      vec.addElement("durya");
	      System.out.println("Size is: "+vec.size());
	      vec.removeElement("anantha");

	      System.out.println("Size: "+vec.size());
	      System.out.println("Capacity after increment is: "+vec.capacity());

	      /*Display Vector elements*/
	      Enumeration en = vec.elements();
	      System.out.println("\nElements are:");
	      while(en.hasMoreElements())
	         System.out.println(en.nextElement() + " ");
	   }
}
