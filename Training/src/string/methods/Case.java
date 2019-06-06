package string.methods;

public class Case {
	public static void main(String args[]) {
		String s[]={"aNantHa","moKShithA","duRga"};
		int n=s.length;
		for(int i=0;i<n;i++)
		{
			String cap = s[i].substring(0, 1).toUpperCase() + s[i].substring(1).toLowerCase();
			System.out.println(cap);
		}
	}
}
