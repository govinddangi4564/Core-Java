package Basic.Pattern;

public class B {
	public static void main(String[] args) {
		int a = 7;

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= 3*a/4; j++) {
				if(j == 1) {
					System.out.print("*");
				}else if(i == 1 || i == a || i == a/2+1) {
					System.out.print("*");
				}else if((j == a-3 && i == 2) || (j == a-3 && i == 3) || (j == a-3 && i == 5) ||(j == a-3 && i == 6)) {
					System.out.print("*");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
