package inheritance;

public class Child_3 extends Appa {

	public void cycle() {
		System.out.println("hero");
	}
	public static void main(String[] args) {
		//class name object name = new class name();
		Child_3 m = new Child_3();
		m.cycle();
		m.gold(); 
		
	}
}
