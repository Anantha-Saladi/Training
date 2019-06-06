package exception.handling;
import java.io.*;

public class CheckedException {
	  public static void main ( String[] a ) throws IOException
	  {
	    BufferedReader stdin = new BufferedReader ( new InputStreamReader( System.in ) );

	    String inData;
	    System.out.println("Enter a string:");
	    inData = stdin.readLine();
	    System.out.println(inData);
	 
	  }
}
