package inheritance;

public class Child_1 extends Appa{
	public void car() {
		System.out.println("land rover");
	}
	public static void main(String[] args) {
		//class name object name = new class name();
		Child_1 a = new Child_1();
		a.car();
		a.gold();
	}

}