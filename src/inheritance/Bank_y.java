package inheritance;

public class Bank_y extends Bank_x {
	public void landDocument() {
		System.out.println("100 acres");
		
	}
	public static void main(String[]args) {
		//class name object name = new class name();
		Bank_y n = new Bank_y();
		n.landDocument();
		n.money();
		n.gold();
	}

}
