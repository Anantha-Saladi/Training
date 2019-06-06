package numbers.storage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
public class FileCopyExample {
 
	public static void main(String[] args) {
 
		try {
			FileReader fr = new FileReader("/home/anantha/Desktop/Integer1.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("/home/anantha/Desktop/data.txt");
			String s;
 
			while ((s = br.readLine()) != null) { // read a line
				fw.write(s+"\n"); // write to output file
				fw.flush();
			}
			br.close();
			fw.close();
            System.out.println("file copied");
		} 
		catch (IOException e) {
			
			System.out.println(e);
		}
	}
}