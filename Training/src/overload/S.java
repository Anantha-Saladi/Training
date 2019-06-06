package overload;

public class S {
	int m1=78,m2=89,m3=90,tm;
	void sum() {
		tm=m1+m2+m3;
		System.out.println("Total="+tm);
	}
	void sum(int a,int b,int c) {
		m1=a;
		m2=b;
		m3=c;
		tm=m1+m2+m3;
		System.out.println("Total="+tm);
	}
	public static void main(String args[]) {
		S s1=new S();
		s1.sum();
		s1.sum(56,45,78);
		s1.sum(34,53,75);
	}
}
