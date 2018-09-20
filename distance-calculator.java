//import Scanner
import java.util.Scanner;

public class distance {
	public static void main (String[] args) {
    //prompt user to enter values
    Scanner scan = new Scanner(System.in);
    System.out.println("enter x1: ");
	int x1 = scan.nextInt();
    
    System.out.println("enter x2: ");
	int x2 = scan.nextInt();

    System.out.println("enter y1: ");
	int y1 = scan.nextInt();

    System.out.println("enter y2: ");
	int y2 = scan.nextInt();
    
    //calulating distance
    double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) * 1.0);
    System.out.println("The distance is: " + distance);
    }
}