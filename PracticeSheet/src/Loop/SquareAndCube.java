package Loop;

public class SquareAndCube {
	public static void main(String[] args) {
		int n = 5;

		int sq = 1;
		int cb = 1;
		
		for (int i = 0; i < 2; i++) {
			sq = sq * n;
		}
		
		for (int i = 0; i < 3; i++) {
			cb = cb * n;
		}
		
		System.out.println("Square = " + sq);
		System.out.println("Cube = " + cb);
	}
}
