package Exception;

import javax.management.RuntimeErrorException;

public class Throw_Throws {
	
	public  void throwdemo() throws InterruptedException,NullPointerException {  // throws in method signature la
		Thread.sleep(10000);
		
		throw new RuntimeException(); // trow in method ulla 

	}
	
	public static void main(String[] args) throws NullPointerException, InterruptedException {
		Throw_Throws n = new Throw_Throws();
		n.throwdemo();
	}

}
