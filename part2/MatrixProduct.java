/*
 * Brent Lee (blee96)
 * Kaitlin Bleich (kbleich)
 * 10/11/2018
 * Project 2 Part 2
 */

public class MatrixProduct {

    /* USING DAC ALGORITHM */
    public static int[][] matrixProduct_DAC(int[][] A, int[][] B) {
        if (!(A.length == A[0].length                           //if A is a square matrix
              && A[0].length == B.length                        //if col of A is the same row of B
              && B.length == B[0].length                        //if B is a square matrix
              && (Math.log10(A.length)/Math.log10(2) % 1) == 0)) {  //if divisible by 2
            throw new IllegalArgumentException("");
        }
        return matrixProduct_DAC(A,0,0,B,0,0,A.length);
        
    }

    private static int[][] matrixProduct_DAC(int[][] A, int srA, int scA, int[][] B, int srB, int scB, int n) {
        int[][] C = new int[n][n];
        if (n == 1) {
            C[0][0] = A[srA][scA] * B[srB][scB];
        } else {
            int[][] C11 = addMatrix(
                matrixProduct_DAC(A, srA, scA, B, srB, scB, n/2),
                matrixProduct_DAC(A, srA, scA+n/2, B, srB+n/2, scB, n/2));
            int[][] C12 = addMatrix(
                matrixProduct_DAC(A, srA, scA, B, srB, scB+n/2, n/2),
                matrixProduct_DAC(A, srA, scA+n/2, B, srB+n/2, scB+n/2, n/2));
            int[][] C21 = addMatrix(
                matrixProduct_DAC(A, srA+n/2, scA, B, srB, scB, n/2),
                matrixProduct_DAC(A, srA+n/2, scA+n/2, B, srB+n/2, scB, n/2));
            int[][] C22 = addMatrix(
                matrixProduct_DAC(A, srA+n/2, scA, B, srB, scB+n/2, n/2),
                matrixProduct_DAC(A, srA+n/2, scA+n/2, B, srB+n/2, scB+n/2, n/2));
            for (int i = 0; i < n/2; i++) {
                for (int j = 0; j < n/2; j++) {
                    C[i][j] = C11[i][j];
                    C[i][j+n/2] = C12[i][j];
                    C[i+n/2][j] = C21[i][j];
                    C[i+n/2][j+n/2] = C22[i][j];
                }
            }
        }
        return C;
    }

    private static int[][] addMatrix(int[][] left, int[][] right) {
        int[][] resMatrix = new int[left.length][left.length];
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < left[0].length; j++) {
                resMatrix[i][j] = left[i][j] + right[i][j];
            }
        }
        return resMatrix;
    }



    /* USING STRASSEN ALGORITHM */
//    public static int[][] matrixProduct_Strassen(int[][] A, int[][] B) {
//    }
}
