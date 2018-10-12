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
        
    }

    private static int[][] matrixProduct_DAC(int[][] A, int srA, int scA, int[][] B, int srB, int scB, int n) {
        int[][] C = new int[n][n];
        if (n == 1) {
            C[0][0] = A[srA][scA] * B[srB][scB];
        } else {
            int[][] C11 = addMatrix(
                matrixProduct_DAC(A, 0, 0, B, 0, 0, n/2),
                matrixProduct_DAC(A, 0, n/2+1, B, n/2+1, 0, n/2));
            int[][] C12 = addMatrix(
                matrixProduct_DAC(A, 0, 0, B, 0, n/2+1, n/2),
                matrixProduct_DAC(A, 0, n/2+1, B, n/2+1, n/2+1, n/2));
            int[][] C21 = addMatrix(
                matrixProduct_DAC(A, n/2+1, 0, B, 0, 0, n/2),
                matrixProduct_DAC(A, n/2+1, n/2+1, B, n/2+1, 0, n/2));
            int[][] C22 = addMatrix(
                matrixProduct_DAC(A, n/2+1, 0, B, 0, n/2+1, n/2),
                matrixProduct_DAC(A, n/2+1, n/2+1, B, n/2+1, n/2+1, n/2));
            for (int i = 0; i < n; i++) {
            }
        }
        return C;
    }

    private static int[][] addMatrix(int[][] left, int[][] right) {
    }



    /* USING STRASSEN ALGORITHM */
//    public static int[][] matrixProduct_Strassen(int[][] A, int[][] B) {
//    }
}
