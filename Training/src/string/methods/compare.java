package string.methods;

public class compare {
	public static void main(String args[]) {
		String str="Anantha";
		String str1=new String("Anantha");
		System.out.println(str.concat(str1));
		if(str==(str1))
			System.out.println("Equal");
		else
			System.out.println("Not equal");
		if(str.equals(str1))
			System.out.println("Equal");
		else
			System.out.println("NotEqual");
	}
}
