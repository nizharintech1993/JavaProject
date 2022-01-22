package Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Full_Exception {
	public static void main(String[] args) throws FileNotFoundException  {



		int a = 20;
		long m = 9626418216l;
		try {
			int b= a/0;
			System.out.println(b);
			int []c =null;
			System.out.println(c[1]);
			throw new NullPointerException();

		} catch (ArithmeticException e) {
			System.out.println("arithmatic exception occured"); // specified exception
		}catch (NullPointerException e) {
			System.out.println("null pointer exception occured"); // specied exception

		}catch (Exception e) {
			System.out.println("will exicute athor then above"); // specific exception handle first and then
			//give common eception

		}finally {
			System.out.println("finally is ececuted");
			
		}
		System.out.println("problem solved");
		System.out.println(m);
		
		File h = new File("ac.txt") ;
		try {
			FileInputStream k = new FileInputStream(h);
		} catch (FileNotFoundException e) {                 // it handled with try catch
		//	e.printStackTrace();
			System.out.println("file exception handled");
			
		}
		File s = new File("bcd.txt");
		FileInputStream p = new FileInputStream(s);// int not handled it throws
		System.out.println("ok done");

	}
}
