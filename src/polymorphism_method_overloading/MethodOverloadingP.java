package polymorphism_method_overloading;

public class MethodOverloadingP {
	public  void student() {
		System.out.println("student is raj");
	}
	public void student(int i) {
		System.out.println("student id is" +" "+i);
		//System.out.println(i);
	}
	public void student(char c, String s) {
		System.out.println("student name is" + c+". " +s);
	}
	public static void main(String[] args) {
		// class name object name = new class name();
		MethodOverloadingP l = new MethodOverloadingP();
		l.student();
		l.student(10);
		l.student('T',"sai");
		
	}

}
