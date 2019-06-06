package numbers.storage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutput {
	public static void main(String args[]) throws IOException 
    { 
        //writing the data using DataOutputStream 
        try ( DataOutputStream dout = 
                    new DataOutputStream(new FileOutputStream("/home/anantha/Desktop/Integer1.txt")) ) 
        { 
            dout.writeDouble(1.1); 
            dout.writeInt(55); 
            dout.writeBoolean(true); 
            dout.writeChar('4'); 
        } 
        catch(FileNotFoundException ex) 
        { 
            System.out.println("Cannot Open the Output File"); 
            return; 
        } 
          
        // reading the data back using DataInputStream 
        try ( DataInputStream din = 
                    new DataInputStream(new FileInputStream("/home/anantha/Desktop/Integer1.txt")) ) 
        { 
            double a = din.readDouble(); 
            int b = din.readInt(); 
            boolean c = din.readBoolean(); 
            char d=din.readChar(); 
            System.out.println("Values: " + a + " " + b + " " + c+" " + d); 		
        } 
        catch(FileNotFoundException e) 
        { 
            System.out.println("Cannot Open the Input File"); 
            return; 
        } 
    } 
}
