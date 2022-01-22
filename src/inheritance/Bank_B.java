package inheritance;

public class Bank_B extends Bank_A {
public void landDocument( ) {
	System.out.println("5 acres");
}
public static void main(String[] args) {
	Bank_B h= new Bank_B();
	h.landDocument();
	h.cash();
	h.gold();
}
}
