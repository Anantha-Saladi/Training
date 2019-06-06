package numbers.storage;

import java.io.File;

public class RenameFile {

    public static void main(String[] args) {
        //absolute path rename file
        File file = new File("/home/anantha/Desktop/Integer1.txt");
        File newFile = new File("/home/anantha/Desktop/Integer.txt");
        if(file.renameTo(newFile)){
            System.out.println("File rename success");;
        }
        else {
            System.out.println("File rename failed");
        }
        
        
        //java move file from one directory to another
        file = new File("/home/anantha/Desktop/Integer2.txt");
        newFile = new File("/home/anantha/Integer2.txt");
        if(file.renameTo(newFile)){
            System.out.println("File move success");;
        }
        else {
            System.out.println("File move failed");
        }
        
    }

}