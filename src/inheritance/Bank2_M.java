package inheritance;

public class Bank2_M  extends Bank1_M{
	public void gold() {
		System.out.println("100 grams");
	}
	public static void main(String[] args) {
		// class name object name = new class name();
		Bank2_M J = new Bank2_M();
		J.cash();
		J.gold();
	}

}
