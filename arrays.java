
/*
Arrays
Oct 24th, 2018
This program prompts user to enter 5 interger numbers and finds the average of the array
Limitation: 5 positive interger number 
*/

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // System.out.println("Enter 5 double values");
        double[] array = new double[5];
        int[] arrayInt = new int[5];

        for (int i = 0; i < arrayInt.length; i++) {
            array[i] = scan.nextDouble();

        }
        System.out.println(averageInt(array));
        System.out.println(averageDouble(array));
        scan.close();
    }

    // int average
    public static int averageInt(double[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int avg = sum / array.length;
        return avg;

    }

    // double array
    public static double averageDouble(double[] array) {
        double sumDoub = 0;
        for (int i = 0; i < array.length; i++) {
            sumDoub += array[i];
        }
        double avgDoub = sumDoub / array.length;
        return (double) avgDoub;
    }
}
