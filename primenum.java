import java.util.Scanner;

public class PrimeNum {
   public static void main(String args[]) {		
	
    int temp;
    boolean isPrime = true;
    Scanner scan= new Scanner(System.in);
    System.out.println("Enter a number between 2 and 1,000: ");
    int num = scan.nextInt();
    if (num <2)
	
    int i=2;
    while(i<= num/2) {
        if(num % i == 0) {
            isPrime = false;
        break;
        }
    i++;
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
/***Jonathan Chao***/