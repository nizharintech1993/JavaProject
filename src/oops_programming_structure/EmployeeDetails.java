package oops_programming_structure;

public class EmployeeDetails {
	
	public void empName() {
		
		System.out.println("employee name is ashock");
	}
	
	public void empId() {
		System.out.println("employee id is 108");
	}
		
		
		public void empLocation() {
			System.out.println("employee location is pudukkottai");
			
		}
		
		public static void main(String[] args) {
			// class name object name = new class name();
			
			EmployeeDetails hour = new EmployeeDetails();
			hour.empName();
			hour.empId();
			hour.empLocation();
		}
	}
