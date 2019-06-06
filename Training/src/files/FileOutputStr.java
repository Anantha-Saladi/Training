package files;

import java.io.*;

public class FileOutputStr {
	public static void main(String[] args) throws IOException {  
        FileOutputStream file = new FileOutputStream("/home/anantha/Desktop/data3.txt");  
        DataOutputStream data = new DataOutputStream(file);  
        data.write(58);  
        data.flush();  
        data.close();  
        System.out.println("Succcess...");  
    }  
}
