package OOPM.Interface1;

public class FTest {
	public static void main(String[] args) {
		FInter obj = new FInter() {
			
			@Override
			public void hello() {
				System.out.println("Hello of FInter using Annonymous");
			}
		};
		obj.hello();
		
		System.out.println("----------------------------------------------------");
		
//		Lambda Expression -- only work with functional interface / Single method
		
		FInter jj = () -> {
			System.out.println("i am Hello of FInter using Lambda");
		};
		
		jj.hello();
		
		System.out.println("----------------------------------------------------");

		FInter kk = () -> System.out.println("i am Hello of FInter using Lambda");
		
		kk.hello();
	}

}
