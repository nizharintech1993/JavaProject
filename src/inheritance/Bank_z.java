package inheritance;

public class Bank_z extends Bank_y{
	public void locker() {
		System.out.println("100 carrot diamond");
	}
	public static void main(String[]args) {
		Bank_z c = new Bank_z();
		c.locker();
		c.gold();
		c.money();
		c.landDocument();
	}

}
