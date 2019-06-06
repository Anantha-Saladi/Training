package string.methods;

public class RemoveSpaces {
	public static void main(String args[])
	{
	String str="  hai hello How is ur job";
	
	System.out.println(str);
	char[] strArray = str.toCharArray();

	StringBuffer sb = new StringBuffer();

	for (int i = 0; i < strArray.length; i++)
	{
		if( (strArray[i] != ' ') && (strArray[i] != '\t') )
		{
			sb.append(strArray[i]);
		}
	}
	System.out.println(sb);
}
}