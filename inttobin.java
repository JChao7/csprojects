//Program to change interger numbers to binary
import java.util.Scanner;

public class IntotoBin {
    public static void main(String[] args) {
        float num;
        String result = "";
        float digit;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        num = scan.nextInt();
        
        //loop
        do {
            digit = num % 2;
            result = Math.round(digit) + result;
            num = num / 2;
        }
        while ((num != 0) && (num >= 2));

        System.out.println("Binary number: " + result);
    scan.close();
    }
}
/***Jonathan Chao***/