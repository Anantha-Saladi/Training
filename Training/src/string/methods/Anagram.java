package string.methods;

public class Anagram {
	public static void main(String ar[]) {
		String s1="abcd";
		String s2="bdca";
		int flag=0;
		char s3[]=s1.toCharArray();
		char s4[]=s2.toCharArray();
		int n1=s1.length();
		int n2=s2.length();
		if(n1==n2)
		{
			for(int i=0;i<n1;i++)
			{
				flag=1;
				for(int j=0;j<n1&&flag==1;j++)
				{
					if(s3[i]==s4[j])
					flag=0;
				}
				if(flag==1)
					break;
			}
			if(flag==0)
				System.out.println("String2 is anagram of string1");
			else
				System.out.println("String2 is not anagram of string1");
		}
	}
}