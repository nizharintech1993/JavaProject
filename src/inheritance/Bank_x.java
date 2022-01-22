package inheritance;

public class Bank_x {
	public void money() {
		System.out.println("10000000");
	}
	public void gold() {
		System.out.println("5 kilograms");
		
	}
	public static void main(String[]args) {
		//class name object name = new class name();
		
		Bank_x i = new Bank_x();
		i.money();
		i.gold();
	}

}
