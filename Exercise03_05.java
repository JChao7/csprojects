import java.util.Scanner;

public class Exercise03_05 {

	public static void main(String[] args) {
		System.out.println("Enter package weight: ");
		Scanner scan = new Scanner(System.in);
		double weight= scan.nextDouble();
		
		if (weight > 20) {
			System.out.println("Package cannot be shipped");
			}
		
		if ((weight > 0) && (weight <= 1)) {
			System.out.println("The shipping cost is $3.5");
		}
		
		else if ((weight > 1) && (weight <= 3)) {
			System.out.println("The shipping cost is $5.5");
		}
		
		else if ((weight > 3) && (weight <= 10)) {
			System.out.println("The shipping cost is $8.5");
		}
		
		else if ((weight > 10) && (weight <= 20)) {
			System.out.println("The shipping cost is $10.5");
		}
		else if (weight <= 0) {
		System.out.println("Invalid input");
		}
		scan.close();
	}
}
