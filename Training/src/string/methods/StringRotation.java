package string.methods;
class StringRotation { 
  
    static boolean areRotations(String str1, String str2) 
    { 
        /* There lengths must be same and str2 must be 
        	a substring of str1 concatenated with str1.*/ 
        return (str1.length() == str2.length()) &&  
               ((str1 + str1).contains(str2)); 
    } 
  
    public static void main(String[] args) 
    { 
        String str1 = "DAAB"; 
        String str2 = "ABDA"; 
  
        if (areRotations(str1, str2)) 
            System.out.println("Yes"); 
        else
            System.out.printf("No"); 
    } 
}