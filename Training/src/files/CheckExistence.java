package files;

import java.io.*;
//import java.io.FileWriter;
//import java.io.IOException;

public class CheckExistence {
	public static void main(String[] args) throws IOException {
		File f=new File("/home/anantha/Documents/hai.txt");
		boolean b=f.exists();
		if(b) 
			System.out.println("File already exist");
		else {
			f.createNewFile();
			System.out.println("File successfully created");
		}
		System.out.println("Writing content into file");
		FileWriter fw=new FileWriter(f);
		fw.write("good morning");
		fw.write("have a nice day");
		fw.close();
		FileReader fr=new FileReader(f);
		System.out.println("Reading data from file");
		int i=fr.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=fr.read();
		}
		fr.close();
		FileWriter fwr=new FileWriter(f,true);
		fwr.write("\nHai hello how are u");
		fwr.close();
		
		System.out.println("\nReading data from file after append");
		FileReader fre=new FileReader(f);
		i=fre.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=fre.read();
		}
		fre.close();
	}
}
