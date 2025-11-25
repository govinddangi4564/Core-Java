package Interface1;

public class TestB {
	public static void main(String[] args) {
		BInter bi = new BInter() {

			@Override
			public void wish() {
				System.out.println("Wish at Annonymous");
			}
			
			@Override
			public void hello() {
				System.out.println("Hello at Annonymous");
			}
		};
		
		bi.hello();
		bi.wish();
	}
}
