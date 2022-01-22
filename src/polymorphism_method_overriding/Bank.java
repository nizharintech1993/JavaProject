package polymorphism_method_overriding;

public class Bank {
	public void sbiBank() {
		System.out.println("giving loan amount 10000");
	}
	public void indianBank() {
		System.out.println("giving loan amount 20000");
	}
	public void indianOverseasBank() {
		System.out.println("giving loan amount 30000");
		
	}
	public static void main(String[]args) {
		//class name object name = new class name object name():
		
		Bank m = new Bank();
		m.sbiBank();
		m.indianBank();
		m.indianOverseasBank();
	}

}
  