
public class Task {
	boolean isEqual(Integer i,Integer j) {
		if(i==j)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Task t=new Task();
		Integer num1=-129;
		Integer num2=-129;
		System.out.println(t.isEqual(num1, num2));
	}
}
