package vector;
import java.util.*;

public class FirstElement {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add('a');
		v.add('b');
		v.add('c');
		v.removeElement('b');
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		System.out.println(v.indexOf('c'));
		System.out.println("Vector before insertion"+v);
		v.insertElementAt("anantha",1);
		System.out.println("Vector after insertion is"+v);
	}
}
