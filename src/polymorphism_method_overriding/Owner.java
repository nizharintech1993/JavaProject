package polymorphism_method_overriding;

public class Owner {
	
	public void ownerName() {
		System.out.println("you are appointed");
	}
	public void ownerSalary() {
		System.out.println("salary is 50000");
	}
	public static void main(String[] args) {
		//class name object name + new object name ():
	  Owner o= new Employee();
	//Owner o= new Employee();// it is upcasting 
		o.ownerName();
		o.ownerSalary();
	}

}
