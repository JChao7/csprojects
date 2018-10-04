import java.util.Scanner;

public class PrimeNum {
   public static void main(String args[]) {		
	
    int temp;
    int count =2;
    boolean isPrime = true;
    Scanner scan= new Scanner(System.in);
    System.out.println("Enter a number between 2 and 1,000: ");
    int num = scan.nextInt();
    if (num <2 || num > 1000) {
        System.out.println("Sorry, please enter a valid number between 2 and 1,000");
    }
	else {
        while(count <= num/2) {
            if(num % count == 0) {
                isPrime = false;
            break;
            }
        count++;
        }
	        if (isPrime) {
	            System.out.println(num + " is a Prime Number");
	        }
	        else {
	            System.out.println(num + " is not a Prime Number");
   		    }
    scan.close();
        }
   }
}
/***Jonathan Chao***/
