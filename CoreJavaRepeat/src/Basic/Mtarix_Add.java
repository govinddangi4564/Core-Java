package Basic;

public class Mtarix_Add {
	public static void main(String[] args) {
		int Mat1[][] = { { 2, 3, 8 }, { 2, 3, 4 }, {3, 5, 9} };
		int Mat2[][] = { { 5, 2, 7 }, { 4, 2, 2 }, {2, 3, 9} };

		int Result[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				Result[i][j] = Mat1[i][j] + Mat2[i][j];
			}
		}
		
		
		
		System.out.println("Result is : ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(Result[i][j] + "  ");
			}
			System.out.println();
		}
		
		//for loopm for adding two matrix
		
//		for(int i = 0; i<Mat1.length; i++ ) {
//			for(int j= 0; j<Mat2[i].length; j++) {
//				System.out.print(Mat1[i][j] + Mat2[i][j] + " ");
//			}
//			System.out.println();
//		}

		System.out.println("***********************************************");
		System.out.println("Matrix is : ");
		for (int[] a : Mat1) {
			for (int b : a) {
				System.out.print(b + "  ");
			}
			System.out.println();
		}

		System.out.println("***********************************************");
		int Var = 2;

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				if (Var == Mat1[i][j]) {
					System.out.println("Value Index : " + i + " " + j);
					break;
				}
			}
		}
		for (int i = 0; i < Mat1.length; i++) {
			for(int j=0; j<Mat1[0].length; j++) {
				int temp = Mat1[i][j];
				Mat1[i][j] = Mat2[i][j];
				Mat2[i][j] = temp;
			}
		}
	}
	
	
}



