package Interface1;

public class TestC {
	public static void main(String[] args) {

		CInter ci = new CInter() {

			@Override
			public void happy() {
				System.out.println("I am happy with Annonymous of CInter");
			}
		};
		
		ci.happy();
		
//		Lambda ---- java 8
		
		CInter cc = () -> {
			System.out.println("I am happy from CInter using Lambda ");
		};
		
		cc.happy();
		
		CInter ck = () -> System.out.println("I am happy from CInter with single line");
		ck.happy();
	}
}
