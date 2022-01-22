package inheritance;

public class Bank_A {
	public void gold() {
		System.out.println("100 kilograms");
	}
	public void cash() {
		System.out.println("100000000000");
	}
	public static void main(String[] args) {
		Bank_A x = new Bank_A();
		x.gold();
		x.cash();
	}

}
