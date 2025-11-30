package Basic.Pattern;

public class L {
	public static void main(String[] args) {
		int a = 7;
		
		for(int i = 1; i <= a; i++) {
			for(int j = 1; j<= 2*a/3; j++) {
				if(j == 1 || i == a) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

}
