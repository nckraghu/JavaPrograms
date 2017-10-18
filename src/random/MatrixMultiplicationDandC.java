package random;

/**
 * Created by Gowtham on 31-01-2017
 */
public class MatrixMultiplicationDandC {

    private static int[][] matrixAdd(int[][] X, int[][] Y) {
        int[][] Z = new int[X.length][X[0].length];

        for (int row = 0; row < X.length; row++) {
            for (int col = 0; col < X[0].length; col++) {
                Z[row][col] = X[row][col] + Y[row][col];
            }
        }

        return Z;
    }

    @SuppressWarnings("ManualArrayCopy")
    private static int[][] matrixConstruct(int[][] C11, int[][] C12, int[][] C21, int[][] C22) {
        int[][] newMatrix = new int[C11.length + C21.length][C11[0].length + C12[0].length];

        for (int row = 0; row < C11.length; row++) {
            for (int col = 0; col < C11[0].length; col++) {
                newMatrix[row][col] = C11[row][col];
            }
        }

        for (int row = 0; row < C12.length; row++) {
            for (int col = 0; col < C12[0].length; col++) {
                newMatrix[row][col + C11[0].length] = C12[row][col];
            }
        }

        for (int row = 0; row < C21.length; row++) {
            for (int col = 0; col < C21[0].length; col++) {
                newMatrix[row + C11.length][col] = C21[row][col];
            }
        }

        for (int row = 0; row < C22.length; row++) {
            for (int col = 0; col < C22[0].length; col++) {
                newMatrix[row + C11.length][col + C21[0].length] = C22[row][col];
            }
        }

        return newMatrix;
    }

    @SuppressWarnings("ManualArrayCopy")
    private static int[][] matrixGetC11(int[][] X) {
        int[][] C11 = new int[X.length / 2][X[0].length / 2];

        for (int row = 0; row < X.length / 2; row++) {
            for (int col = 0; col < X[0].length / 2; col++) {
                C11[row][col] = X[row][col];
            }
        }

        return C11;
    }

    @SuppressWarnings("ManualArrayCopy")
    private static int[][] matrixGetC12(int[][] X) {
        int[][] C12 = new int[X.length / 2][X[0].length / 2];

        for (int row = 0; row < X.length / 2; row++) {
            for (int col = 0; col < X[0].length / 2; col++) {
                C12[row][col] = X[row][col + X[0].length / 2];
            }
        }

        return C12;
    }

    @SuppressWarnings("ManualArrayCopy")
    private static int[][] matrixGetC21(int[][] X) {
        int[][] C21 = new int[X.length / 2][X[0].length / 2];

        for (int row = 0; row < X.length / 2; row++) {
            for (int col = 0; col < X[0].length / 2; col++) {
                C21[row][col] = X[row + X.length / 2][col];
            }
        }

        return C21;
    }

    @SuppressWarnings("ManualArrayCopy")
    private static int[][] matrixGetC22(int[][] X) {
        int[][] C22 = new int[X.length / 2][X[0].length / 2];

        for (int row = 0; row < X.length / 2; row++) {
            for (int col = 0; col < X[0].length / 2; col++) {
                C22[row][col] = X[row + X.length / 2][col + X[0].length / 2];
            }
        }

        return C22;
    }

    @SuppressWarnings("SuspiciousNameCombination")
    private static int[][] matrixMultiply(int[][] X, int[][] Y) {
        int[][] Z;

        if (X.length == 1 && X[0].length == 1) {
            Z = new int[][]{{X[0][0] * Y[0][0]}};
        } else {
            Z = matrixConstruct(matrixAdd(matrixMultiply(matrixGetC11(X), matrixGetC11(Y)), matrixMultiply(matrixGetC12(X), matrixGetC21(Y))),
                    matrixAdd(matrixMultiply(matrixGetC11(X), matrixGetC12(Y)), matrixMultiply(matrixGetC12(X), matrixGetC22(Y))),
                    matrixAdd(matrixMultiply(matrixGetC21(X), matrixGetC11(Y)), matrixMultiply(matrixGetC22(X), matrixGetC21(Y))),
                    matrixAdd(matrixMultiply(matrixGetC21(X), matrixGetC12(Y)), matrixMultiply(matrixGetC22(X), matrixGetC22(Y))));
        }

        return Z;
    }

    public static void main(String... args) {
        int[][] A = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
        int[][] B = {{2, 2, 2, 2}, {2, 2, 2, 2}, {2, 2, 2, 2}, {2, 2, 2, 2}};
//        int[][] A = {{2, 2, 2, 2}, {2, 2, 2, 2}, {2, 2, 2, 2}, {2, 2, 2, 2}};

        int[][] C = matrixMultiply(A, B);

        //noinspection ForLoopReplaceableByForEach
        for (int row = 0; row < C.length; row++) {
            for (int col = 0; col < C[0].length; col++) {
                System.out.print(C[row][col] + " ");
            }
            System.out.println();
        }
    }
}
