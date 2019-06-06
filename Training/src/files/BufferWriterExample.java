package files;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterExample {

	public static void main(String[] args)throws IOException {
		FileWriter writer = new FileWriter("/home/anantha/Desktop/data4.txt");  
	    BufferedWriter buffer = new BufferedWriter(writer);  
	    buffer.write("Welcome to javaTpoint.");  
	    buffer.close();  
	    System.out.println("Success"); 
	    FileReader fr=new FileReader("/home/anantha/Desktop/data4.txt");    
        BufferedReader br=new BufferedReader(fr);  

        int i;    
        while((i=br.read())!=-1){  
        System.out.print((char)i);  
        }  
        br.close();    
        fr.close();   

	}

}
