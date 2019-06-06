package examplein.heritance;

public class FourWheeler extends Vehicle {

    FourWheeler(String r,int m,int n)
    {
        super(r,m);
        noOfWheel=n;
    }
    void display()
    {
        System.out.println("Four wheeler car");
        super.display();
        System.out.println("No. of leaf:" +noOfWheel);
    }
    public static void main(String arg[])
    {
        TwoWheeler t1;
        ThreeWheeler th1;
        FourWheeler f1;
        t1=new TwoWheeler("AP050366", 1,2);
        th1=new ThreeWheeler("TN3545", 4,3);
        f1=new FourWheeler("Ap052894",5,4);
        t1.display();
        th1.display();
        f1.display();
    }
}
