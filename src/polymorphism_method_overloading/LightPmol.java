package polymorphism_method_overloading;

public class LightPmol {
	public void functions(String wiring) {
		System.out.println("check out the wiring connections"+":"+" "+wiring);
	}
	
	public void functions(int find,int identify) {
		System.out.println("find board and switch numbers"+":"+" "+"boardN"+" "+find+" "+"switchN"+" "+identify);
		
	}
	
	public void functions(String light,boolean processing) {
		System.out.println("execute switch and light "+":"+" "+light+" "+processing);
	}	
	
	public static void main(String[] args) {
		// class name object name + class name ();
		//object creation syntax
		
		LightPmol f = new LightPmol();
		f.functions("checked");
		f.functions(2, 5);
		f.functions("on", true);
		
	}

}
  