package inheritance;

public class Sbi_H extends Rbi_H{
	public void rbirules() {
		System.out.println("followed 15% interest rate");
	}
	public static void main(String[] args) {
		// class name object name = new class name();
		Sbi_H u = new Sbi_H();
		u.rules();
		u.rbirules();
	}

}
