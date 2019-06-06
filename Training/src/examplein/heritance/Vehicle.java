package examplein.heritance;

public class Vehicle {
	private String regno;
   private int model;
    int noOfWheel;
    Vehicle(String r, int m)
    {
        regno=r;
        model=m;
    }
    void display()
    {
        System.out.println("Registration no: "+regno);
        System.out.println("Model no: "+model);
    }
	
}
