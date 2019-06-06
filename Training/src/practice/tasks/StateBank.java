package practice.tasks;

public class StateBank implements BankRequirements {
	public void noOfEmployees() {
		System.out.println("Total number of employees=40");
	}
	public void schemes() {
		System.out.println("Schemes provided by "+bankName+" are:");
		System.out.println("Gold loans\t Education loans\tAgricultural loans");
	}
	public void securitySystems() {
		System.out.println("secrete cameras");
	}
	public static void main(String[] args) {
		StateBank sb=new StateBank();
		sb.noOfEmployees();
		sb.schemes();
		System.out.println("Bank name="+bankName);
		System.out.println("Bank location="+bankLocation);
	}

}
