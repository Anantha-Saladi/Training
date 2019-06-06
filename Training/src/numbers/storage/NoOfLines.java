package numbers.storage;
import java.io.*;
import java.util.*;

public class NoOfLines {
	public static void main(String[] args) {
		File f=new File("/home/anantha/Desktop/Integer1.txt");
		try {
		
			FileWriter fw=new FileWriter(f);
			boolean b=f.exists();
			if(b)
				System.out.println("File already exist");
			else {
				f.createNewFile();
				System.out.println("File created");
			}
			Scanner sc=new Scanner(System.in);
			boolean i;
			int count=0;
			System.out.println("Enter some text to place in file");
			while(i=sc.hasNextLine()) {
				String s=sc.nextLine();
				fw.write(s+"\n");
				count++;
			}
			fw.close();
			System.out.println("No of lines in file:"+count);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
