package Loop;

public class BinaryToDecimal {
	public static void main(String[] args) {
		int binary = 101010;
		
		int decimal = 0;
		int base = 1;
		
		while(binary > 0) {
			int lastDigit = binary % 10;
			decimal = decimal + lastDigit * base;
			base = base * 2;
			binary = binary / 10;
		}
		System.out.println("Decimal number = " + decimal);
	}
}
