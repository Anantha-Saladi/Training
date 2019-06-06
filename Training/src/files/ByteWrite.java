package files;
import java.io.*;

public class ByteWrite {
	public static void main(String[] args) {
        
        OutputStream opStream = null;
        try {
            String strContent = "This example shows how to write byte content to a file";
            byte[] byteContent = strContent.getBytes();
            File myFile = new File("/home/anantha/Documents/byte.txt");
            // check if file exist, otherwise create the file before writing
            if (!myFile.exists()) {
                myFile.createNewFile();
                System.out.println("File created successfully");
            }
            else
            	System.out.println("File already exist");
            opStream = new FileOutputStream(myFile);
            opStream.write(byteContent);
            opStream.flush();
            System.out.println("Data inserted successfully");
        } 
        catch (IOException e) {
        	System.out.println(e);
        } 
       
    }
}
