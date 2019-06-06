package files;
import java.io.FileWriter;

public class FileWriterExample {

	public static void main(String[] args) {
		try{    
			FileWriter fw=new FileWriter("/home/anantha/Desktop/data3.txt");    
	        fw.write("Welcome to primesoft");    
	        fw.close();    
	    }
		catch(Exception e) {
			System.out.println(e);
	    }    
	    System.out.println("Success...");
	          
	}    
}

