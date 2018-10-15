/*
 * Brent Lee (blee96)
 * Kaitlin Bleich (kbleich)
 * 10/08/2018
 * Project2
 */

import java.util.*;
import java.io.*;

public class MatrixWork {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inFile;
        System.out.print("Enter a filename: ");
        inFile = scanner.nextLine();
        File file = new File(inFile);
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
            System.exit(0);
        }
        System.out.println("");
        String s = scanner.nextLine();
        String[] r = s.split(" ");
        int[] rows = {Integer.parseInt(r[0]), Integer.parseInt(r[1])};
        int[][] A = new int[rows[0]][rows[1]];
        for (int i = 0; i < rows[0]; i++) {
            r = scanner.nextLine().split(" ");
            for (int j = 0; j < r.length; j++) {
                A[i][j] = Integer.parseInt(r[j]);
            }
        }
        s = scanner.nextLine();
        r = s.split(" ");
        int[] rows1 = {Integer.parseInt(r[0]), Integer.parseInt(r[1])};
        int[][] B = new int[rows1[0]][rows1[1]];
        for (int i = 0; i < rows1[0]; i++) {
            r = scanner.nextLine().split(" ");
            for (int j = 0; j < r.length; j++) {
                B[i][j] = Integer.parseInt(r[j]);
            }
        }
        try {
            int[][] C = MatrixProduct.matrixProduct_DAC(A, B);
            System.out.println("Product matrix:");
            for (int i = 0; i < C.length; i++) {
                String str = "";
                for (int j = 0; j < C[0].length; j++) {
                    System.out.print(str + C[i][j]);
                    str = " ";
                }
                System.out.println("");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("not a square matrix OR not a power of 2");
        }
    }
}
