package inheritance;

public class Iob_H extends Rbi_H {
	public void rbiRules() {
		System.out.println("followed 15% interest rate");
		
	}
	public static void main(String[] args) {
		// class name object name = new class name();
		Iob_H b = new Iob_H();
		b.rules();
		b.rbiRules();
	}
}




























