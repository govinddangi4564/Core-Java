package Loop;

public class SumAndProductOfAllDigit {
	public static void main(String[] args) {
		int n = 123;

		int sum = 0;
		int pro = 1;
		int rem;
		while(n > 0) {
			rem = n % 10;
			sum = sum + rem;
			pro = pro * rem;
			
			n = n / 10;
		}
		
		System.out.println("Sum = " + sum);
		System.out.println("Product = " + pro);
	}
}
