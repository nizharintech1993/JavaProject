package inheritance;

public class Bank_C extends Bank_A{
	public void diamond() {
		System.out.println("100 carrot");
	}
	public static void main(String[] args) {
		Bank_C o = new Bank_C();
		o.diamond();
		o.cash();
		o.gold();
	}

}
