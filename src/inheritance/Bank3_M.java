package inheritance;

public class Bank3_M extends Bank2_M{
	public void diamond() {
		System.out.println("hundred carrot");
	}
	public static void main(String[] args) {
		// class name object name = new class name ();
		Bank3_M k = new Bank3_M();
		k.cash();
		k.gold();
		k.diamond();
	}
}
