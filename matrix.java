
/*
Matrix
October 31st, 2018
>purpose
genMatrix - generate random positive intergers less than 100 and stores in the array
printMatrix - prints the array
isSymetric - sees if the arrays are symetric and return true or false
multiply - multipies the array by a constant
square - multiplies array by the power of 2
*/
import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
    }

    // 1.
    public static double[][] genMatrix(double num) {
        double[][] mat = new double[num][num];
        for (int i = 0; i <= mat.length; i++)
            for (int j = 0; j <= mat[i].length; j++)
                // initializing array with random positive values less than 100
                mat[i][j] = Math.random() * 100;
        return mat;
    }

    // 2
    public static double[][] printMatrix(double[][] mat) {
        // use /t for tab
        System.out.println(mat);
    }

    // 3
    public static double[][] isSymetric(double[][] mat) {
        for (int a = 0; a < mat.length; a++) {
            for (int b = 0; b < mat.length; b++) {
                if (mat[a][b] != mat[b][a]) {
                    System.out.println("False");
                    return isSymetric;
                }
            }
        }
        return true;
    }

    // 4
    public static double[][] multiply(double[][] mat) {
        double[][] multiarray = new double[mat][mat];
        printMatrix(mat);
    }

    // 5
    public static double[][] square(double[][] mat) {
        double[][] result = mat;
        for (int n = 1, p; n < p; ++n)
            result = multiplyMatrices(result, mat);
        return result;
    }

}