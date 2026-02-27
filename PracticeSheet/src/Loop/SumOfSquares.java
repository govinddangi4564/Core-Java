package Loop;

public class SumOfSquares {
	public static void main(String[] args) {
        int n = 5;
        int sum = 0;

        for(int i = 1; i <= n; i++) {
            sum = sum + (i * i);
        }

        System.out.println("Sum of squares = " + sum);
    }
}
