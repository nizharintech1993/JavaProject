package interface_;

public class Child implements ParentClass_1,ParentClass_2{

	@Override
	public void bike() {
		System.out.println("bike count is 1 and bike name is bmw");
		
	}

	@Override
	public void land() {  
		System.out.println("50 acres ");
		
	}

	@Override
	public void gold() {
		System.out.println("100 grams");
		
	}

	@Override
	public void house() {
		System.out.println("3 bhk apartment");
		
	}

	@Override
	public void car() {
		System.out.println("one range rover ");
		
	}
	public static void main(String[] args) {
		// class name object name = new class name();
		 Child  c = new Child();
		 c.bike();
		 c.land();
		 c.gold();
		 c.house();
		 c.car();
	}
	

}
