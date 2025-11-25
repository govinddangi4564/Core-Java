package Basic;

public class TestDimension {
	public static void main(String arg[]) {
		// 1st way----1-D(Dimension) array
		// compile time memory
		int pp[] = { 2, 5, 4, 7, 6, 8 };
		System.out.println(pp);
		System.out.println(pp.length);
		System.out.println(pp[0]);
		System.out.println("------------------------------------------------------------");

		// 2nd way----1-D(Dimension) array
		// Run time memory
		// when value is not given than use this
		int qq[] = new int[5];
		qq[0] = 87;
		qq[1] = 62;
		qq[2] = 61;
		qq[3] = 19;
		qq[4] = 82;

		// 3rd way----1-D(Dimension) array
		int rr[] = new int[] { 8, 2, 5, 1, 4, 2 };
		System.out.println(rr[5]);

		System.out.println("---------------------TWO D ARRAY----------------------------");

		// 1st way----2-D(Dimensional) array
		int ab[][] = { { 1, 2, 3, 4 }, { 2, 4, 6, 8 }, { 3, 6, 9, 7 } };
		System.out.println(ab);
		System.out.println(ab.length);
		System.out.println(ab[0]);
		System.out.println(ab[0][0]);
		System.out.println(ab[0].length);
		System.out.println(ab[2]);
		System.out.println(ab[2][2]);
		System.out.println(ab[2].length);

		System.out.println("-------------------------------------------------------------");

		for (int i = 0; i < ab.length; i++) {
			for (int j = 0; j < ab[i].length; j++) {
				System.out.print(ab[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------------------------");
		// 2nd way----2-D(Dimensional) array
		int xy[][] = new int[2][3];
		xy[0][0] = 1;
		xy[0][1] = 2;
		xy[0][2] = 3;

		xy[1][0] = 6;
		xy[1][1] = 8;
		xy[1][2] = 2;

		System.out.println(xy);
		System.out.println(xy.length);
		System.out.println(xy[0]);
		System.out.println(xy[0].length);
		System.out.println(xy[0][1]);
		System.out.println("-------------------------------------------------------------");
		// use of for each loop
		for (int a[] : xy) {
			for (int b : a) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------------------------");
		// use of for loop
		for (int i = 0; i < xy.length; i++) {
			for (int j = 0; j < xy[i].length; j++) {
				System.out.print(xy[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------------------------");

		// 3rd way of 3-D(Dimensional) array
		int pq[][] = new int[][] { { 1, 2, 3, 4 }, { 2, 1 }, { 2, 3 } };
		System.out.println(pq);
		System.out.println(pq.length);
		System.out.println(pq[0]);
		System.out.println(pq[0].length);
		System.out.println(pq[0][1]);
		System.out.println("-------------------------------------------------------------");

		for (int i = 0; i < pq.length; i++) {
			for (int j = 0; j < pq[i].length; j++) {
				System.out.print(pq[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------------------------");

		// 3(dimensional) array

	}
}
