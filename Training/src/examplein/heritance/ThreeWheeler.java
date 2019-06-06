package examplein.heritance;

public class ThreeWheeler extends Vehicle {
    ThreeWheeler(String r,int m,int n)
    {
        super(r,m);
        noOfWheel=n;
    }
    void display()
    {
        System.out.println("Three wheeler auto");
        super.display();
        System.out.println("No. of leaf:" +noOfWheel);
    }

}
