package inheritance;

public class IndianBank_H extends Rbi_H{
	public void rbiRules() {
		System.out.println("followed 15% interest rate");
		
	}
	public static void main(String[] args) {
		// class name object name = new class name();
		IndianBank_H D = new IndianBank_H();
		D.rules();
		D.rbiRules();
	}

}
