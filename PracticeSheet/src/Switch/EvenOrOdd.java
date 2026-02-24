package Switch;

public class EvenOrOdd {
	public static void main(String[] args) {
		int n = 11;
		
		int result = (n % 2 == 0) ? 1 : 2 ;
		
		switch(result) {
		
		case 1:
			System.out.println("Even");
			break;
			
		case 2:
			System.out.println("Odd");
			break;
		}
	}
}
