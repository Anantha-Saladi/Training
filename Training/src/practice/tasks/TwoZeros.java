package practice.tasks;

public class TwoZeros {
	public static void main(String[] args) {
		String str="0101010";
		int n=str.length();
		System.out.println(str);
		for(int i=1;i<n;i++) {
			str=str.replace("010","00");
			if(str.contains("010")) {
				continue;
			}
			else
				break;
		}
		System.out.println(str);
	}
}
