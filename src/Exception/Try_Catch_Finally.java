package Exception;

public class Try_Catch_Finally {
	
	public static void main(String[] args) {
		
		int i= 34;
		try {
		int b= i%0;
		}catch (ArithmeticException e) {
			System.out.println(e);
			
		}finally {
			System.out.println("done");
		}
		System.out.println("completed");
	}

}
