/* This program sorts three intergers in ascending order */

//import Scanner
import java.util.Scanner;

public class Lab04_1 {

   public static void main (String[] args) {
    System.out.println("This program sorts three intergers in ascending order");
   
        //prompt user to enter values
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter interger 1: ");
	    int num1 = scan.nextInt();
    
        System.out.println("Enter interger 2: ");
	    int num2 = scan.nextInt();
        
        System.out.println("Enter interger 3: ");
	    int num3 = scan.nextInt();

        if num1 <= num2 && num1 <= num3 {
            System.out.println(num1);
            if num2 <= num3 {
                System.out.println(num2)
                  System.out.println(num3)
            }
            else {
                  System.out.println(num3)
                    System.out.println(num2)
            }
        else {
            
        }
        }
    }
}

/*** By Jonathan Chao ***/