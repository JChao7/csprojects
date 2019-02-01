import java.util.Scanner;

public class Exercise05_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.print("Enter the tuition fee: ");	
		double tuition = scan.nextDouble();
		for (double i = 1.0 ; i <= 10 ; i++) {
			tuition *= 1.05;
		}
		
		System.out.printf("Tuition in ten years is %.2f \n", tuition);
		double total = 0;
		double cost = tuition;
		for (int i = 0 ; i < 4 ; i++) {
			total += cost;
			cost *= 1.05 ;
		}
		
		System.out.printf("The four-year tuition in ten years is %.2f", total);
		scan.close();
	}
}
