package string.methods;

public class Trailing {
	public static void main(String args[])
	{
		String str=" hai ; +hello* how $ are % you ";
		  str = str.trim();
		 String delims = "\\W+";
		 String[] tokens = str.split(delims); 
		for (String item : tokens) { 
			  
            System.out.println(item + " "); 
        } 
		
	}

}
