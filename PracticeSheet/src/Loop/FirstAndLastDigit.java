package Loop;

public class FirstAndLastDigit {
	public static void main(String[] args) {
		int n = 45678;
		
		int lastDigit = n % 10;
		int firstDigit = n;
		
		while(firstDigit >= 10) {
			firstDigit = firstDigit / 10;
		}
		
		System.out.println("First digit = " + firstDigit);
		System.out.println("Last digit = " + lastDigit);
		
		System.out.println("Sum = " + (firstDigit + lastDigit));
		System.out.println("Subtract = " + (firstDigit - lastDigit));
		System.out.println("Multiplication = " + (firstDigit * lastDigit));
		System.out.println("Division = " + (firstDigit / lastDigit));
		
		System.out.println();
		System.out.println("Swap digits...........");
		
		int temp = firstDigit;
		firstDigit = lastDigit;
		lastDigit = temp;
		
		System.out.println("First digit = " + firstDigit);
		System.out.println("Last digit = " + lastDigit);
		
	}
}
