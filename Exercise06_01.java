import java.util.Scanner;

public class Exercise06_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double amount, rate;
		int years;
		
		System.out.println("Enter investment amount, monthly interest rate and year: ");
		amount = scan.nextDouble();
		rate = scan.nextDouble();
		years = scan.nextInt();
		futureInvestmentValue(amount, rate, years);
		
		System.out.println("Years    Future Value");
		for(int n = 1 ; n <= years ; n++) {
			System.out.print(n +"        ");
			System.out.printf("%.2f\n", futureInvestmentValue(amount, rate, n));
		}
		
		scan.close();
	}
	
	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		double value = investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
		return value;
	}
}
