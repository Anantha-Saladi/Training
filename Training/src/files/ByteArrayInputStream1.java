package files;

import java.io.*;

public class ByteArrayInputStream1{
	 public static void main(String[] args) throws IOException {  
		    byte[] buf = { 35, 36, 37, 38 };  
		    // Create the new byte array input stream  
		    ByteArrayInputStream byt = new ByteArrayInputStream(buf); 
		    File f=new File("/home/anantha/Desktop/data4.txt");
		    FileWriter fw=new FileWriter(f);
		    boolean b=f.exists();
		    if(b) 
		    	System.out.println("File already exist");
		    else {
		    	f.createNewFile();
		    	System.out.println("File created successfully");
		    }
		    int k = 0;  
		    while ((k = byt.read()) != -1) {  
		      //Conversion of a byte into character  
//		      char ch = (char) k;  
		      fw.write(k);
		      System.out.println("ASCII value of Character is:" + k );  
		    }  
		    fw.close();
		  }  
}
