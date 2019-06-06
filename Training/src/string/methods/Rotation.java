package string.methods;

public class Rotation {
	public static void main(String args[])
	{
		String s=new String("mokshi");
		int n=s.length();
		char str[]=s.toCharArray();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
			
				System.out.print(str[j]);
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print(str[k]);
			}
			System.out.println();
		}
	}
}
