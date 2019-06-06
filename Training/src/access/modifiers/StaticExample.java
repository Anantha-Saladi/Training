package access.modifiers;

public class StaticExample {
	static int a=10;
	static final double d=12.86;
	float f=8.0f;
	public static void main(String args[]){
		System.out.println(StaticExample.a);
		System.out.println(StaticExample.d);
		StaticExample se=new StaticExample();
		System.out.println(se.f);
		a=11;
		System.out.println(StaticExample.a);
	}
}
