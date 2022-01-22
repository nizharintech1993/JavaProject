package inheritance;

public class Son extends Parent{
	
	public void bike() {
		System.out.println("two bikes");
	}
	public void clothes() {
		System.out.println("four set of clothes");
	}
	public static void main(String[] args) {
		// class name object name = new class name();
		Son call = new Son();
		call.bike();
		call.clothes();
		call.land();
		call.house();
	}

}
