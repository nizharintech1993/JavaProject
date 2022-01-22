package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Demo {
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("divided by");
		
		try{
			int num = s.nextInt();
		    int b = num%0;
		System.out.println(b);

		}catch (ArithmeticException e) {   // we give indivitual a per exception
			System.err.println("cannot divided by zero");
			//e.printStackTrace();
			//System.out.println(e.getMessage());
		}catch (InputMismatchException e) {   /// individual 
			System.out.println("must be in number");
		}finally {
			s.close();
		}
		System.out.println("process done");
	
	
	}
	
	
	
	
	
}