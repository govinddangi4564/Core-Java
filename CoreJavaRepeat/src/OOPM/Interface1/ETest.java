package OOPM.Interface1;

public class ETest {
	public static void main(String[] args) {
		EInter obj = new EInter() {
			
			@Override
			public void wish() {
				System.out.println("wish of EInter using Annomous");
				
			}
			
			@Override
			public void show() {
				System.out.println("Show of EInter using Annomous");
				
			}
		};
		
		obj.show();
		obj.wish();
	}

}
