package abstraction;

public class Abstract_Class1 extends Abstract_Class{
	@Override
	public void atmOwner() {
		System.out.println("atm owner name is nizhar");
		
	}
	@Override
	public void atmPin() {
System.out.println("atm pin num is 1234");		
	}
	@Override
	public void atmCvv() {
System.out.println("atm cvv num is 000");
	}
public static void main(String[] args) {
	// class name object name = new class name();
	Abstract_Class1 c = new Abstract_Class1();
	c.atmOwner();
	c.atmPin();
	c.atmCvv();
}
}


