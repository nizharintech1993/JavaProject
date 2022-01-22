package inheritance;

public class Parent {
	public void land() {
		System.out.println("land totally 100 acres");
	}
		public void house() {
			System.out.println("house totally 2");
		}
		public static void main(String[] args) {
			//class name object name = new class name();
			Parent appa = new Parent();
			appa.land();
			appa.house();
		}
		
		}
