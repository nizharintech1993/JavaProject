package Selection_Statement;

public class Nested_if {
	public static void main(String[] args) {
		
		int age = 24;
		int weight=50;
		
		if(age>20) {
			System.out.println("oii");
			if(weight<51) {                            // outer loop false--> go the outer loop else
				                                      // outer loop true ---> goto inner loop
				                                        // inner loop true ----> inner loop if block execute
				                                            // inner loop false ---> execute inner loop else
				System.out.println("hai");
			}else
				System.out.println("boy");              // outer loop true ----> outer loop block execute then go for inner loop
				
		}else
			System.out.println("if outer else");
		
		

}
}