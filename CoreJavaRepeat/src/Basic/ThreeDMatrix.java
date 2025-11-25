package Basic;

public class ThreeDMatrix {

	public static void main(String[] args) {
        // Create a 3D matrix (3 x 4 x 2)
        int[][][] matrix = {
            { {1, 2}, {3, 4}, {5, 6}, {7, 8} },
            { {9, 10}, {11, 12}, {13, 14}, {15, 16} },
            { {17, 18}, {19, 20}, {21, 22}, {23, 24} }
        };
        
        //Using for each loop
        for(int [][]a : matrix) {
        	for(int []b : a) {
        		for(int c : b ) {
        			System.out.print(c + "  ");
        		}
        		System.out.println();
        	}
        	System.out.println();
        }

        // Print the 3D matrix
        System.out.println("3D Matrix elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix[i][j].length; k++) {
                    System.out.print(matrix[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
    }

}
