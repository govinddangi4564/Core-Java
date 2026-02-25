package Loop;

public class FrequencyOfDigit {
	public static void main(String[] args) {
		int n = 1233325;
		
		int digit = 3;	
		int count = 0;
		
		while(n != 0) {
			int rem = n % 10;
			
			if(rem == digit) {
				count++;
			}
			n = n / 10;
		}
		System.out.println("Frequency of a digit " + digit + " is = " + count);
	}
}
