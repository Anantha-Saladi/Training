package studentpackage;

public class SetGet {
	private int pinNumber;
	private String password;
	void setPinNumber(int n) {
		pinNumber=n;
	}
	int getPinNumber() {
		return pinNumber;
	}
	void setPassword(String pw) {
		password=pw;
	}
	String setPassword() {
		return password;
	}
}
