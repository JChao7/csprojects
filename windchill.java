/* Program to calculate the wind speed index implemented on the National Weather Service in 2001 */

//import Scanner
import java.util.Scanner;

public class windchill {

   public static void main (String[] args) {
   System.out.println("This program calculates the wind-chill index");
   //prompt user to enter values
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter the temperature in Celsius: ");
	int ta = scan.nextInt();
    
   System.out.println("Enter the wind speed in km/h: ");
	int v = scan.nextInt();

   //calulate Windspeed
   double twe = 13.112 + (0.6215 * ta) - 11.37 * Math.pow(v, 0.16) + 0.3965 * ta * Math.pow(v, 0.16);
 
   System.out.println("The wind chill index is: " + twe);
   }
}

/*** By Jonathan Chao ***/
