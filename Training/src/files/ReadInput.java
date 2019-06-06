package files;
import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class ReadInput {
	 public static void main ( String [] args )  {
         // Prompt the user
		 try {
         System.out.print( "Type some data for the program: " );
         Scanner sc=new Scanner(System.in);
         File f=new File("/home/anantha/Desktop/data3.txt");
         FileWriter fr=new FileWriter(f);
         // Read a line of text from the user.
         
         while(sc.hasNextLine()) {
        	 String input = sc.nextLine();
        	 fr.write("\n"+input);
//        	 System.out.println(input);
         }
        // Display the input back to the user.
         fr.close();
         sc.close();
//         fw.open();
        FileWriter fw=new FileWriter(f,true);
     	fw.write("\nHai hello how are u");
     	fw.close();
     	System.out.println("Success");
     	System.out.println("Content of file is:");
     	FileReader reader=new FileReader(f);
     	int i;
     	while((i=reader.read())!=-1)
     		System.out.print((char)i);
     	reader.close();
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }
     } // end main method

}
