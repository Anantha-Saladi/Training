package files;
import java.io.File;
import java.io.FileWriter;

public class FileAppend {
	public static void main(String[] args)throws Exception {
	File f=new File("/home/anantha/Desktop/data.txt");
	 boolean fvar = f.createNewFile();
     if (fvar){
    	 System.out.println("File has been created successfully");
     }
     else {
    	 System.out.println("File already present at the specified location");
     }
	FileWriter fw=new FileWriter(f,true);
	fw.write("\nHai hello how are u");
	fw.close();
	System.out.println("Success");
	}
}
