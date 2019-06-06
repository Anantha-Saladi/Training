package string.methods;
import java.util.*;
public class StringTokenize {
	public static void main(String args[])
	{
		StringTokenizer  st=new StringTokenizer("Anantha Lakshmi Saladi");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextElement());
		}
	}
}
