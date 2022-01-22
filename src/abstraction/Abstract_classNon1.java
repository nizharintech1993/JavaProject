package abstraction;

public class Abstract_classNon1  extends Abstract_ClassNon{
	@Override
	public void atmOwner() {
		super.atmOwner();
	}
	
	
	
	@Override
	public void atmPin() {
		System.out.println("atm pin num is 1234");
		
	}
	@Override
	public void atmCvv() {
		System.out.println("atm cvv num is 000");
		
	}
	public static void main(String[]args) {
		// class name object name = new class name();
		Abstract_classNon1 f = new Abstract_classNon1();
		f.atmOwner();
		f.atmPin();
		f.atmCvv();
	}
	

}
