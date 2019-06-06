package numbers.storage;
import java.io.IOException;
import java.io.*;

public class Store {
	public static void main(String[] rags) {
		try {
			File f= new File("/home/anantha/Desktop/Integer1.txt");
			FileWriter fw = new FileWriter(f);
			
//			Integer i=100;
			fw.write("132");
			System.out.println("Success");
			fw.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
