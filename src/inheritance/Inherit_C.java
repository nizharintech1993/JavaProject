package inheritance;

public class Inherit_C extends Inherit_B {
public void stdSection() {
	// TODO Auto-generated method stub
System.out.println("Student's section is B");
}
public static void main(String[] args) {
	Inherit_C c = new Inherit_C();
	c.stdName();
	c.stdId();
	c.stdSection();
}
}
