package Loop.Pattern;

public class NumberReverseTriangle {
	public static void main(String[] args) {
		int n = 9;
		int a = n;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for(int k=n; k>=i; k--) {
				System.out.print(a);
			}
			a--;
			System.out.println();
		}
	}

}
