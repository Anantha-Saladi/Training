package numbers.storage;
import java.io.*;
public class FileExtension {

    /**
     * Get File extension in java
     * @param args
     */
    public static void main(String[] args) {
        File file = new File("java.txt");
        System.out.println("File extension is: "+getFileExtension(file));
       
        file = new File("temp");
        System.out.println("File extension is: "+getFileExtension(file));
       
        file = new File("java.util.txt");
        System.out.println("File extension is: "+getFileExtension(file));
     
        file = new File("g.jpg.txt");
        System.out.println("File extension is: "+getFileExtension(file));
    }

    private static String getFileExtension(File file) {
        String fileName = file.getName();
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
        return fileName.substring(fileName.lastIndexOf(".")+1);
        else return "";
    }

}