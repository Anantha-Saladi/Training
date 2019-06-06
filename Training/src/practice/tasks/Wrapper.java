package practice.tasks;

public class Wrapper {
	public static void main(String[] args) {
		int k=10;
		Integer it=new Integer(k);
		int m=it.intValue();
		System.out.println("value is:"+(m*m));
	}
}
