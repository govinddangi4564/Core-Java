package Array;

public class CheckSquareMatrix {
	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		if (arr.length == arr[0].length) {
			System.out.println("Square Matrix");
		} else {
			System.out.println("Not Square Matrix");
		}
	}
}
