/*
This program grabs the sum of the even digits and prints if the results are true or false

Finished on Oct. 17, 2018
*/

import java.util.Scanner;

public class SumDigits {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		

        int a, b, c, d;
    	a = intInput(scan);
    	System.out.println(a);
    	System.out.println(addUp(a));
    	
    	b = intInput(scan);
    	System.out.println(b);
    	System.out.println(addUp(b));
    	
    	System.out.println(sumBool(addUp(a), addUp(b)));
        scan.close();
    }

    public static int intInput(Scanner scan) {
    	int a;
    	while (true) {
        	System.out.print("Enter a positive integer: ");
        	a = scan.nextInt();
            if (a > 0)
                break;
            System.out.print("\nError in data! "); 
        }
    	return a;
    }

            
        
    public static int addUp(int num) {
    	int digit;
       	int sumA = 0;

        while (num > 0) {
                digit = num % 10;
                if ( digit % 2 == 0 ) 
                    sumA += digit;
                num = num / 10; 
        }
        return sumA;
    }


        

	public static boolean sumBool(int sumA, int sumB) {	
		
		if (sumA == sumB)
            return true;
        else 
            return false;
    }
}
/* Jonathan Chao */