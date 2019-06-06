package files;

import java.io.*;

public class ReadDynamically {
	public static void main(String[] args) {
        String s;
        File file=new File("/home/anantha/Desktop/data3.txt");

        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        try{
	        PrintWriter pr=new PrintWriter(new BufferedWriter(new FileWriter(file,true)));
	        System.out.println("enter to write in a file...");
	        while((s=br.readLine())!=null) {
	        	pr.println(s);
         }
         pr.close();
      }
      catch(Exception e){

      }
   }
}		
