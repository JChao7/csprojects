import java.util.Scanner;

public class Exercise04_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter to numbers of eggs: ");
		final double DOZEN = 3.25;
		final double EGG = 0.45;
		int user_egg = scan.nextInt();
		
		//math
		int num_dozen = user_egg / 12;
		int num_remainder = user_egg % 12;
		double remainder = num_remainder * EGG;
		double cal_dozen = DOZEN * num_dozen;
		double total = cal_dozen + remainder;
		
		System.out.println("You ordered " + user_egg + " eggs. That's " + num_dozen 
				+ " at $3.25 per dozen and " + num_remainder
				+ " loose eggs at 45 cents each for a total of $" + total);
		scan.close();
	}
}
