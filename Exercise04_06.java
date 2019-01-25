import java.util.Scanner;

public class Exercise04_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter employee's name: ");
		String name = scan.nextLine();
		System.out.println("Enter number of hours worked in a week: ");
		double hours = scan.nextDouble();
		System.out.println("Enter hourly pay rate: ");
		double pay_rate = scan.nextDouble();
		System.out.println("Enter federal tax withholding rate: ");
		double fed_tax = scan.nextDouble();
		System.out.println("Enter state tax witholding rate: ");
		double state_tax = scan.nextDouble();
		
		//calculations
		double gross_pay = pay_rate * hours;
		double total_tax = (fed_tax * gross_pay) + (state_tax * gross_pay);
		double fed_hold = fed_tax * gross_pay;
		double state_hold = state_tax * gross_pay;
		
		//printout
		System.out.println("Employee name: " + name);
		System.out.println();
		System.out.println("Pay rate: $" + pay_rate);
		System.out.println("Gross pay: $" + gross_pay);
		System.out.println("Deductions: $");
		System.out.println("   Federal withholding(" + fed_tax * 100 + "%): $" + Math.round(fed_hold *100.0) / 100.0);
		System.out.println("   State withholding(" + state_tax * 100 + "%): $" + Math.round(state_hold *100.0) / 100.0);
		System.out.println("   Total Deductions: " + Math.round(total_tax *100.0) / 100.0);
		System.out.println("Net pay: $" + (gross_pay - total_tax));
		
		scan.close();
	}

}
