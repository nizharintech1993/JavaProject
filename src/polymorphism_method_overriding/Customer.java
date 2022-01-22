package polymorphism_method_overriding;

public class Customer extends Bank {
	
	@Override
	public void sbiBank() {
		// TODO Auto-generated method stub
		super.sbiBank();
		System.out.println("i want loan amount 20000");
	}

	@Override
	public void indianBank() {
		super.indianBank();
		System.out.println("no i want 25000");
	}
	@Override
	public void indianOverseasBank() {
		super.indianOverseasBank();
		System.out.println("no i need 35000");
	}
	public void bank() {
		System.out.println("three bank asking how much you want");
	}
	public void conclude() {
		System.out.println("totally i want 65000");
	}
	public static void main(String[] args) {
		//Class name object name = new Class name();
		Customer h = new Customer();
	  
		h.sbiBank();
		h.indianBank();
		h.indianOverseasBank();
		h.bank();
		h.conclude();
		
	}
	}
