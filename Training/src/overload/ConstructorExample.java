package overload;
import java.util.Scanner;

class Test {
	int a=10;
	double b,c;
	Test() {
		b=20;
		c=30;
	}
	Test(double b,double c) {
		this.b=b;
		this.c=c;
	}
	Test(int x,int y,int z) {
		a=x;
		b=y;
		c=z;
	}
	void show() {
		System.out.println("Value of a="+a);
		System.out.println("Value of b="+b);
		System.out.println("Value of c="+c);
	}
}
public class ConstructorExample {
	public static void main(String args[]) {
		Test t=new Test();
		t.show();
		Test t1=new Test(1.0,2.0);
		t1.show();
		Test t2=new Test(5,6,7);
		t2.show();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two values");
		int x=s.nextInt();
		int y=s.nextInt();
		Test t3=new Test(x,y);
		t3.show();
		s.close();
	}
}
