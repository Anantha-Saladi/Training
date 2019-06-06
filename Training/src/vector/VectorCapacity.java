package vector;
import java.util.*;

public class VectorCapacity {
	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("Capacity of vector is:"+v.capacity());
		System.out.println("Size of vector is:"+v.size());
		v.addElement("anantha");
		v.addElement("lakshmi");
		System.out.println("Capacity of vector is:"+v.capacity());
		System.out.println("Size of vector is:"+v.size());
		v.removeElement("lakshmi");
		System.out.println("Size of vector is:"+v.size());
		v.add("lakshmi");
		System.out.println("size of vector is:"+v.size());
		
	}
}
