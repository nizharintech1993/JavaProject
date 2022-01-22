package inheritance;

public class Son_S extends Appa_S{
	
	
	public void car() {
		System.out.println("land rover");
	}
	public static void main(String[] args) {
		//class name object name = new class name();
		Son_S o = new Son_S();
		o.land();
		o.car();
	
	}

}
