package Basic.Pattern;

public class J {
	public static void main(String[] args) {
		int a = 7;

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a; j++) {
				if(i == 1) {
					System.out.print("* ");
				}else if(j == a/2+1) {
					System.out.print("* ");
				}else if((j == 1 && i == a-2) || (j == 1 && i == a-1) || (j == 2 && i == a) || (j == 3 && i == a)) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
