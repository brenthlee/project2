public class MTest {
    public static void main(String[] args) {
        int[][] A = {{1,2,3,4},{2,2,3,2},{1,1,1,1},{1,1,1,1}};
        int[][] B = {{1,2,2,2},{2,1,2,2},{2,2,2,2},{4,4,4,4}};
        //int[][] A = {{1,1},{1,1}};
        //int[][] B = {{2,2},{2,2}};
        try {
            MatrixProduct.matrixProduct_DAC(A, B);
        } catch (IllegalArgumentException e) {
            System.out.println("not a square matrix OR not a power of 2");
        }
    }
}
