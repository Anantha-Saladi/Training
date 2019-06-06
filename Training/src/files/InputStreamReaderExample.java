package files;

import java.io.FileInputStream;
//import java.io.InputStream;
import java.io.InputStreamReader;
//import java.io.Reader;

public class InputStreamReaderExample {
	 public static void main(String[] args) {  
	        try  {  
	            FileInputStream stream = new FileInputStream("/home/anantha/Desktop/data4.txt");  
	            InputStreamReader reader = new InputStreamReader(stream);  
	            int data;  
	            while ((data=reader.read())!= -1) {  
	                System.out.print((char) data);  
//	                data = reader.read();  
	            }  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        }  
	    }  
}
