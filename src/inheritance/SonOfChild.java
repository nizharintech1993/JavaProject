package inheritance;

public class SonOfChild extends Son {
	public void books() {
		System.out.println("two physics book and two java books");
	}
	public void pens() {
		System.out.println("2 parker pen and 2 renolds pen");
	}
	public static void main(String[] args) {
		// class name object name = new class name();
		SonOfChild gf = new SonOfChild();
		gf.books();
		gf.pens();
		gf.land();
		gf.house();
		gf.bike();
		gf.clothes();		
	}

}
