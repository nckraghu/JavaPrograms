package random;

/**
 * Created by Gowtham on 31-01-2017
 */
public class MatrixMultiplication {

    private static int[][] matrixMultiply(int[][] X, int[][] Y) {
        int[][] Z = new int[X.length][Y[0].length];

        for (int row = 0; row < X.length; row++) {
            for (int col = 0; col < Y[0].length; col++) {
                Z[row][col] = 0;
                for (int i = 0; i < X[0].length; i++) {
                    Z[row][col] = Z[row][col] + X[row][i] * Y[i][col];
                }
            }
        }

        return Z;
    }

    public static void main(String... args) {

        int[][] A = {{1, 1},
                {1, 1},
                {1, 1}
        };
        int[][] B = {{2},
                {2}
        };

        int[][] C = matrixMultiply(A, B);

        for (int[] c : C) {
            for (int col = 0; col < C[0].length; col++) {
                System.out.print(c[col] + " ");
            }
            System.out.println();
        }

    }
}
