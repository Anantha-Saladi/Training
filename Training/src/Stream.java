import java.io.*;
public class Stream {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter a character");
		int i=System.in.read();//returns ASCII code of 1st character  
		System.out.println(i);//will print the character  
	}
}
