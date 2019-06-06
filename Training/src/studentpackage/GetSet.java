package studentpackage;

public class GetSet {
	public static void main(String[] args) {
		SetGet se=new SetGet();
		se.setPinNumber(245);
		System.out.println("pin number is="+se.getPinNumber());
		se.setPassword("An@ath2$");
		System.out.println("Password is="+se.setPassword());
	}
}
