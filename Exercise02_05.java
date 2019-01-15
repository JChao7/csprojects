import java.util.Scanner;;
public class Exercise02_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter monthly saving amount: ");
		
		double month_interest = 0.05 / 12;
		double inital = scan.nextDouble();
		
		//calculations
		double first_month = inital * (1 + month_interest);
		System.out.println("After the first month, the account value is " + first_month);
		
		double sec_month = (inital + first_month) * (1 + month_interest);
		System.out.println("After the second month, the account value is " + sec_month);
		
		double third_month = (inital + sec_month) * (1 + month_interest);
		System.out.println("After the third month, the account value is " + third_month);
		
		double fourth_month = (inital + third_month) * (1 + month_interest);
		System.out.println("After the fourth month, the account value is " + fourth_month);
		
		double fifth_month = (inital + fourth_month) * (1 + month_interest);
		System.out.println("After the fifth month, the account value is " + fifth_month);
		
		double sixth_month = (inital + fifth_month) * (1 + month_interest);
		System.out.println("After the sixth month, the account value is " + sixth_month);
	}

}
