/*
 * Brent Lee (blee96)
 * Kaitlin Bleich (kbleich)
 * 10/11/2018
 * Project 2 Part 2
 */

public class MatrixProduct {

    /* USING DAC ALGORITHM */
    public static void matrixProduct_DAC(int[][] A, int[][] B) {
        if (!(A.length == A[0].length                           //if A is a square matrix
              && A[0].length == B.length                        //if col of A is the same row of B
              && B.length == B[0].length                        //if B is a square matrix
              && (Math.log10(A.length)/Math.log10(2) % 1) == 0  //if divisible by 2
              && A.length >= 1)) {                              //if there is a square matrix of 1
            throw new IllegalArgumentException("");
        }
        
    }

    /* USING STRASSEN ALGORITHM */
//    public static int[][] matrixProduct_Strassen(int[][] A, int[][] B) {
//    }
}
