/*
 * Brent Lee (blee96)
 * Kaitlin Bleich (kbleich)
 * 10/08/2018
 * Project2
 */

import java.util.*;
import java.io.File;

public class MatrixWork {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inFile;
        System.out.println("Enter a filename:");
        inFile = scanner.nextLine();
        File file = new File(inFile);
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNextLine()) {
        }
    }

    public static int[][] matrixProduct(int[][] A, int[][] B) {
        if (A[0].length != B.length) {
            throw new IllegalArgumentException("columns in A != rows in B");
        }
    }

}
