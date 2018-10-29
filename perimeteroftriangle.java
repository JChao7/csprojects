import java.util.Arrays;
import java.util.Scanner;

public class PerimeterOfTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userAnswer = "";                
        //loop the program
        while(userAnswer == "no") {
        
        int point1_x = scan.nextInt();
        int point1_y = scan.nextInt();
        int point2_x = scan.nextInt();
        int point2_y = scan.nextInt(); 
        int point3_x = scan.nextInt();
        int point3_y = scan.nextInt();
        int sum = 0;
        System.out.println("The perimeter of a triangle with point1 " + point1_x + ","+ point1_y + ", point2" + point2_x + "," + point2_y + "and point3" + point3_x + "," + point3_y + "is" + sum);
        userAnswer = scan.next();
        }
    }

    public static Boolean verifyTriangle(int point1_x, int point1_y, int point2_x, int point2_y, int point3_x,
            int point3_y) {

        // finding the length of each line
        double lineA = (Math.sqrt(Math.pow(point2_x - point1_x, 2))) + (Math.sqrt(Math.pow(point2_y - point1_y, 2)));
        double lineB = (Math.sqrt(Math.pow(point3_x - point2_x, 2))) + (Math.sqrt(Math.pow(point3_y - point2_y, 2)));
        double lineC = (Math.sqrt(Math.pow(point3_x - point1_x, 2))) + (Math.sqrt(Math.pow(point3_y - point1_y, 2)));

        // testing if it's actually a triangle
        if ((lineA == lineB) || (lineB == lineC) || (lineA == lineC)) {
            return false;
            System.out.print("Error, try again");
        } else
            return true;
        return verifyTriangle;
    }

    public static int sum(int lineA, int lineB, int lineC) {
        int sum = lineA + lineB + lineC;
        return sum;
    }
}
