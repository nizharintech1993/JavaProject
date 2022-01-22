package Selection_Statement;

public class Return {
	
	

	public  int id(int x ,int y , int z) {
			System.out.println(x+y+z);
		return x+y+z;
		}
		public   String name (String name) {
			System.out.println(name);
			return name;
			}                              // method with using static keyword can i call straightly
		                                 // with out using object if we remove the static we can call using object
	
		public static void main(String[] args) {
	
			Return n  = new Return();
			n. id(34, 40,100);
			n.name("mohammednizhar");
	       
//	public  static int salaryId(int d , int e) {
//		return d+e;
//	}
//	public static String name(String hai) {
//
//		return hai;
//
//	}
//    public static void main(String[] args) {
//
//		int y = salaryId(34888566, 36);
//		System.out.println(y);
//		String v = name("aravinth");
//		System.out.println(v);
//	}


		}
}







