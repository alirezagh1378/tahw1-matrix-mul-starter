package ir.ac.kntu;

public class MatrixSolution{

    public static int[][] multiply(int[][] matA,int[][] matB){
        //return null when multiplication is not possible

    }

    public static void main(String[] args){
        int[][] d = {{1, 2, 3, 5},{4, 5, 6, 8}};
        int[][] c = {{1, 2, 3},{4, 5, 6},{9, 1, 3},{9, 1, 3}};
        int[][] multiply = multiply(d, c);
        System.out.println("multiply = " + Arrays.deepToString(multiply));
    }

}