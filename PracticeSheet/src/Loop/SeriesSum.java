package Loop;

public class SeriesSum {
	 public static void main(String[] args) {
	        int n = 5;
	        int total = 0;

	        for(int i = 1; i <= n; i++) {
	            int sum = 0;
	            for(int j = 1; j <= i; j++) {
	                sum = sum + j;
	            }
	            total = total + sum;
	        }

	        System.out.println("Total Sum = " + total);
	    }
}
