package interface_;

public class QueenI implements KingI{

	@Override
	public void praposal() {
		System.out.println("i love you");
	}
	public static void main(String[] args) {
		// class name object name = class name ();
		QueenI l = new QueenI();
		l.praposal();
	}
}


