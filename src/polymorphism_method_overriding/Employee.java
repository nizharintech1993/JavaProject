package polymorphism_method_overriding;

public class Employee extends Owner{
	@Override
	public void ownerName() {
		super.ownerName();
	}
	 @Override
	public void ownerSalary() {
		super.ownerSalary();
		System.out.println("employee want 100000");
	}
public static void main(String[] args) {
	Employee k = new Employee();
	k.ownerName();
	k.ownerSalary();
	
}
}
 