import java.util.Scanner;

public class Exercise03_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an amount in double ");
		double amount = scan.nextDouble();
		
		int remainder = (int) (amount * 100);
		
		int dollar = (int) remainder /100;
		remainder %= 100;
		
		int quarter = (int) remainder / 25;
		remainder %= 25;
		
		int dime = (int) remainder / 10;
		remainder %= 10;
		
		int nickel = (int) remainder / 5;
		remainder %= 5;
		
		int penny = (int) remainder;
		
		if (dollar == 0) {
			System.out.println("Your amount " + amount + " consists of:");
			System.out.printf(" %5d%10s\n", quarter, (quarter == 1)? "quarter" : "quarters");
			System.out.printf(" %5d%10s\n", dime, (dime==1)? "dime" : "dimes");
			System.out.printf(" %5d%10s\n", nickel, (nickel==1)? "nickel" : "nickels");
			System.out.printf(" %5d%9s\n", penny, (penny==1)? "penny" : "pennys");
		}
		
		else if (quarter == 0) {
			System.out.println("Your amount " + amount + " consists of:");
			System.out.printf(" %5d%10s\n", dollar, (dollar==1)? "dollar" : "dollars");
			System.out.printf(" %5d%10s\n", dime, (dime==1)? "dime" : "dimes");
			System.out.printf(" %5d%10s\n", nickel, (nickel==1)? "nickel" : "nickels");
			System.out.printf(" %5d%9s\n", penny, (penny==1)? "penny" : "pennys");
		}
		
		else if (dime == 0) {
			System.out.println("Your amount " + amount + " consists of:");
			System.out.printf(" %5d%10s\n", dollar, (dollar==1)? "dollar" : "dollars");
			System.out.printf(" %5d%10s\n", quarter, (quarter == 1)? "quarter" : "quarters");
			System.out.printf(" %5d%10s\n", nickel, (nickel==1)? "nickel" : "nickels");
			System.out.printf(" %5d%9s\n", penny, (penny==1)? "penny" : "pennys");
		}
		
		else if (nickel == 0) {
			System.out.println("Your amount " + amount + " consists of:");
			System.out.printf(" %5d%10s\n", dollar, (dollar==1)? "dollar" : "dollars");
			System.out.printf(" %5d%10s\n", quarter, (quarter == 1)? "quarter" : "quarters");
			System.out.printf(" %5d%10s\n", dime, (dime==1)? "dime" : "dimes");
			System.out.printf(" %5d%9s\n", penny, (penny==1)? "penny" : "pennys");
		}
		
		else if (penny == 0) {
			System.out.println("Your amount " + amount + " consists of:");
			System.out.printf(" %5d%10s\n", dollar, (dollar==1)? "dollar" : "dollars");
			System.out.printf(" %5d%10s\n", quarter, (quarter == 1)? "quarter" : "quarters");
			System.out.printf(" %5d%10s\n", dime, (dime==1)? "dime" : "dimes");
			System.out.printf(" %5d%10s\n", nickel, (nickel==1)? "nickel" : "nickels");
		}
		
		else {
		System.out.println("Your amount " + amount + " consists of:");
		System.out.printf(" %5d%10s\n", dollar, (dollar==1)? "dollar" : "dollars");
		System.out.printf(" %5d%10s\n", quarter, (quarter == 1)? "quarter" : "quarters");
		System.out.printf(" %5d%10s\n", dime, (dime==1)? "dime" : "dimes");
		System.out.printf(" %5d%10s\n", nickel, (nickel==1)? "nickel" : "nickels");
		System.out.printf(" %5d%9s\n", penny, (penny==1)? "penny" : "pennys");
			}
		scan.close();
	}
}
