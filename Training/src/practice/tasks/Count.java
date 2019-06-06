package practice.tasks;

public class Count {
public static void main(String args[])
{
	String s=" Hai + this*is %Anantha";
	int l=s.length();
	int vowel=0,cons=0,other=0;
	char[] v=s.toCharArray();
	for(int i=0;i<l;i++)
	{
		if(v[i]=='A' || v[i]=='a' || v[i]=='E' ||v[i]=='e' || v[i]=='I' || v[i]=='i' || v[i]=='O' || v[i]=='o' || v[i]=='U' || v[i]=='u')
		{
			vowel++;
		}
		else if((v[i]>='a' && v[i]<='z') || (v[i]>='A' && v[i]<='Z'))
		{
			cons++;
		}
		else
			other++;
	}
	System.out.println("Number of vowels="+vowel);
	System.out.println("number of consnets="+cons);
	System.out.println("Other charecters="+other);
	int total=vowel+cons+other;
	if(l==total)
		System.out.println("Equal");
	else
		System.out.println("Not equal");
	
}
}
