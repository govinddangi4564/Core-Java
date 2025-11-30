package Basic.Pattern;

public class D {

	public static void main(String[] args) {
		int a = 7;

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a; j++) {
				if(j == 1) {
					System.out.print("*");
				}else if((i == 1 || i == a) && j < a-2) {
					System.out.print("*");
				} else if((i == 2 || i == a-1) && j == a-2) {
					System.out.print("*");
				} else if((i == 3 || i == 4 || i == a-2) && j == a-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
