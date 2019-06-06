package examplein.heritance;

public class TwoWheeler extends Vehicle {
	
	 TwoWheeler(String r,int m,int n)
	    {
	        super(r,m);
	        noOfWheel=n;
	    }
	    void display()
	    {
	        System.out.println("Two wheeler activa");
	        super.display();
	        System.out.println("No. of wheel : " +noOfWheel);
	    }
}
