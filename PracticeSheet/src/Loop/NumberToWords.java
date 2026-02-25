package Loop;

public class NumberToWords {
	public static void main(String[] args) {
		int n = 5685;
		int reverse = 0;
		
		while (n != 0) {
			int rem = n % 10;
			reverse = reverse * 10 + rem;
			n = n / 10;
		}
		
		while(reverse != 0) {
			int digit = reverse % 10;
			
			switch(digit) {
			
			case 1:
				System.out.print("One");
				break;
			case 2:
				System.out.print("Two");
				break;
			case 3:
				System.out.print("Three");
				break;
			case 4:
				System.out.print("Four");
				break;
			case 5:
				System.out.print("Five");
				break;
			case 6:
				System.out.print("Six");
				break;
			case 7:
				System.out.print("Seven");
				break;
			case 8:
				System.out.print("Eight");
				break;
			case 9:
				System.out.print("Nine");
				break;
			case 0:
				System.out.print("Zero");
				break;
			}
			
			reverse = reverse / 10;
		}
	}
}
